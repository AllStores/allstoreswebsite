/* var stores_metadata_cols_to_be_searched = "merchant_id,merchant_name,items_category,main_items,keywords,store_address"; */
var stores_metadata_cols_to_be_searched = "merchant_name,items_category,main_items,keywords,store_address";
var stores_metadata;
var maxCountOfEachMerchant = 3;
var stores_metadata_srachable_cols_arr;
var storage_metadata_key = "stores_metadata";
var storage_filtered_metadata_key = "filtered_stores_metadata";
var website_url = "website_url";
var filteredJSONArr = [];
var latitude = "latitude";
var longitude = "longitude";
var IP_INFO_URL = "https://api.mapmyindia.com/v3?fun=rev_geocode&lic_key=g4xeat2p7gxmeybapqadwv6sej78i3ey&lng=longitude&lat=latitude";
var track_duplicates = "";


//init function 
(function($) {
	
	//prepare stores metadata
	prepareStoresMetadata();
	
	// Get user coordinates
	navigator.geolocation.getCurrentPosition(success, error);

	function success(pos) {
		var crd = pos.coords;

		if (typeof (Storage) != undefined) {
			localStorage.setItem(latitude, crd.latitude);
			localStorage.setItem(longitude, crd.longitude);
		} else {
			console.log("not able to set local storage for the client");
		}

	}
	;

	function error(err) {
		console.warn('ERROR(' + err.code + '): ' + err.message);
	}
	;

})(jQuery);

// This function is called only once to load the stores metadata .....TODO Need
// to be optimized . Send event from server that data got updated and then
// update in client side too-->
function prepareStoresMetadata() {

	$.ajax({
		url : "fetchStoresMetadata",
		type : 'GET',
		dataType : 'json',
		contentType : 'application/json',
		mimeType : 'application/json',
		success : function(data) {

			var jsonData = JSON.stringify(data);
			stores_metadata = JSON.parse(jsonData);

			if (typeof (Storage) != undefined) {
				localStorage.setItem(storage_metadata_key, stores_metadata);
			} else {
				console.log("not able to set local storage for the client");
			}
			
			var storesMetadataInSimpleFormatArr=getStoresMetadataInSimpleFormat(); //Convert associative type of json array to simple one , so taht it can be consumed by typeahead
			 $('#searchbox').typeahead({
			        minLength: 1,
			        source: storesMetadataInSimpleFormatArr ,
			        callback: {
			            onClick: function (node, a, item, event) {
			            	selectdata(item.display);
			                console.log('onClick function triggered');
			     
			            }
			        }
			    });
			
		},
		error : function(data, status, er) {
			console.log("[ Error ] : " + er);
		}
	});

}

function getStoresMetadataInSimpleFormat() {

	var storesMetadataInSimpleFormatArr = [];
	stores_metadata_srachable_cols_arr = stores_metadata_cols_to_be_searched.split(",");
	
	for (searchable_col in stores_metadata_srachable_cols_arr) {
		col_name = stores_metadata_srachable_cols_arr[searchable_col];
		for (i = 0; i < stores_metadata.length; i++) {
			var tempItem = stores_metadata[i][col_name] ;
			storesMetadataInSimpleFormatArr.push(tempItem);
		}
	}
	console.log("simpleStoresMetadataArr="+storesMetadataInSimpleFormatArr);
	return storesMetadataInSimpleFormatArr;
	
}


// On every selection of suggested keyword in search box of Search page this
// function is triggered
function selectdata(val) {
	
	val = val.toLowerCase();

	stores_metadata_srachable_cols_arr = stores_metadata_cols_to_be_searched
			.split(",");
	for (searchable_col in stores_metadata_srachable_cols_arr) {

		col_name = stores_metadata_srachable_cols_arr[searchable_col];

		// ************************************************************
		var filteredJSON = $.grep(stores_metadata, function(e) {

			var value = e[col_name].toString().toLowerCase();

			if (value.indexOf(val) != -1) {

				return true;

			} else {

				return false;
			}

		});

		console.log(filteredJSON);

		for (i = 0; i < filteredJSON.length; i++) {
			item = filteredJSON[i];
			filteredJSONArr.push(item);
		}

	}

	localStorage.setItem(storage_filtered_metadata_key, JSON
			.stringify(filteredJSONArr));

	console.log(JSON.stringify(filteredJSONArr));

}

// get the JSONArray based on area . Area-Wise filtering will act on the
// filtered JSON which we got by user search keyword
function getAreaWiseMetadata(filteredJSON) {
	var l_latitude = localStorage.getItem(latitude);
	var l_longitude = localStorage.getItem(longitude);
	var l_IP_INFO_URL = IP_INFO_URL.replace(longitude, l_longitude);
	l_IP_INFO_URL = l_IP_INFO_URL.replace(latitude, l_latitude);
	var ip_details;
	var areaWiseMetadataMap = {};
	var areaWiseMetadataMapKey;

	track_duplicates = "";

	$
			.get(
					l_IP_INFO_URL,
					function(data) {

						console.log(data[0]["PLZ"]);

						var zipcode = data[0]["PLZ"];
						var areaWisefilteredJSON = $
								.grep(
										filteredJSON,
										function(e) {

											var value = e["store_address"]
													.toString().toLowerCase();

											areaWiseMetadataMapKey = value
													- zipcode;
											if (areaWiseMetadataMapKey < 0) {
												areaWiseMetadataMapKey = -1
														* areaWiseMetadataMapKey;
											}

											if (!areaWiseMetadataMap[areaWiseMetadataMapKey]) {
												var jsonMetadata = [];
												jsonMetadata.push(e);
												areaWiseMetadataMap[areaWiseMetadataMapKey] = jsonMetadata;
											} else {
												var tempArr = areaWiseMetadataMap[areaWiseMetadataMapKey];
												tempArr.push(e);
											}

										});

						var sortedKeys = new Array();
						var sortedObj = {};

						// Separate keys and sort them
						for ( var i in areaWiseMetadataMap) {
							sortedKeys.push(i);
						}
						sortedKeys.sort();

						// Reconstruct sorted obj based on keys
						for ( var i in sortedKeys) {
							sortedObj[sortedKeys[i]] = areaWiseMetadataMap[sortedKeys[i]];
						}

						console
								.log("printing below areaWiseMetadataMap with relevancy : ");
						console.log(sortedObj);

						alert("User current zipcode is :"
								+ zipcode
								+ "  . Results are shown based on nearest zipcodes  to user's current location");

						for ( var i in sortedObj) {
							$
									.each(
											sortedObj[i],
											function(j, val) {

												if (track_duplicates
														.indexOf(val['merchant_id']) == -1) {
													track_duplicates = track_duplicates
															.concat(
																	val['merchant_id'],
																	",");
												} else {
													return false;
												}

												var tr_var = "<tr><td style='padding-left:5em;background-repeat:no-repeat;' background='./default_search_icon.jpg'/></td>"
														+ "<td style='padding-top:.5em;padding-bottom:.5em'><div><p><h3>"
														+ val['merchant_name']
														+ "</h3>   Printing the zipcode for time-being , will be taken off soon "
														+ val['store_address']
														+ "</p><p><a href='"
														+ val['website_url']
														+ "'>"
														+ val['website_url']
														+ "</a> </p></div></td></tr>";

												$(tr_var).appendTo(
														'#results_table')
														.html();
											});
						}

					}, "jsonp");

}
