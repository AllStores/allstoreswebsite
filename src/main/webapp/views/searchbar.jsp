<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Stores</title>

<script type="text/javascript">
	$(document).ready(
			function() {

				getStoresMetadata();

				$("#search-box").keyup(
						function() {
							$("#search-box").css("background",
									"#FFF url(loadericon.gif) no-repeat 100%");
							$("#merchant-data").empty();
							if ($(this).val()) {
								filterData($(this).val());
							} else {
								$("#search-box").css("background", "#FFF");
							}
						});

			});
</script>

</head>



<body>
	<form method="POST" action="./searchresults.php">
		<input type="text" id="search-box" placeholder="Type here"  autocomplete="off" /> <input type="submit" value="Search" class="btn btn-info btn-lg" />
	</form>
	
	<div id="suggesstion-box"
		style="margin-right: auto; margin-left: 40%; width: 30%;">
		<!--    Placeholder for metadata search items listing    -->
		<ul id="merchant-data" style="float: left; list-style: none; margin: 0; padding: 0; width: 100%; height: 100%;"></ul>
	</div>
</body>
</html>