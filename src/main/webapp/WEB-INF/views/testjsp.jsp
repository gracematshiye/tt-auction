<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <spring:url value="/resources/js/jquery.min.js" var="jqueryJS"/>
    <link rel="stylesheet" type="text/css" href="/resources/css/styles.css"/>

    <link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">


<!-- Finish adding tags -->
</head>
<body>

<div style="styles">
    <ul>
      <li class="home"><a href="all-cars">Home</a></li>
      <li><a href="cars">Cars</a></li>
      <li><a href="cars">Contact</a></li>
      <li><a href="cars">About</a></li>
      <li class="dropdown">
        <a href="cars"class="dropbtn">felixsean@ymail.com</a>
        <div class="dropdown-content">
          <a href="#">Account</a>
          <a href="#">Bids</a>
          <a href="#">Logout</a>
        </div>
      </li>
    </ul>
</div>
<div>
    <li><img src="gti.jpeg" alt="GTI"></li>
</div>


<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">


</body>

</html>