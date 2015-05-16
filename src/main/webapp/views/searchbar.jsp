<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Stores</title>
<script src="static/js/jquery.typeahead.js"></script>
<link rel="stylesheet" href="static/css/jquery.typeahead.css">
</head>



<body>

	<form  action="./searchresults">
		<div class="typeahead-container">
			<div class="typeahead-field">

				<span class="typeahead-query"> <input id="searchbox"
					type="search" placeholder="Search" autocomplete="off">
				</span> <span class="typeahead-button">
					<button type="submit">
						<i class="typeahead-search-icon"></i>
					</button>
				</span>

			</div>
		</div>
	</form>


</body>
</html>