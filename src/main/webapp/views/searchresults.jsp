<!DOCTYPE html>

<!-- <?php -->
<!--  header("Access-Control-Allow-Origin: *"); -->
<!-- ?> -->
<html>
<script src="static/js/jquery-2.1.4.min.js"></script>
<script src="static/js/allstores.js"></script>
<link rel="stylesheet" href="static/css/bootstrap.min.css">

<head>

<style>
.frmSearch {
	backwidth: 95%;
	height: 80%;
	background-color: #f1f1f1
}

#merchant-data {
	float: left;
	list-style: none;
	margin: 0;
	padding: 0;
	width: 100%;
	height: 200px;
	overflow: auto;
}

#merchant-data li {
	padding: 3px;
	background: #FAFAFA;
	border-bottom: #F0F0F0 1px solid;
	font-size: smaller
}

#merchant-data li:hover {
	background: #F0F0F0;
}

#search-box {
	padding: 10px;
	border: #F0F0F0 1px solid;
	margin-right: auto;
	margin-left: 40%;
	width: 30%;
}
</style>


<title>AllStores</title>

<script type="text/javascript">
	$(document).ready(
			function() {
				var filteredJSONArr = JSON.parse(localStorage
						.getItem(storage_filtered_metadata_key));
				getAreaWiseMetadata(filteredJSONArr);
			});
</script>

</head>

<body>
	<div class="frmSearch">
		<br />
		<%@ include file="./searchbar.jsp" %> 
		<br />
	</div>


	<div id="results_div" style="position: absolute;">
		<table id="results_table"></table>
	</div>

</body>
</html>