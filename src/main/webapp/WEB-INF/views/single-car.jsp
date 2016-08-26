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
        <li class="logo">
            <a href="cars"class="dropbtn">TT's Online Auction</a>
        </li>
      <li class="home"><a href="all-cars">Home</a></li>
      <li><a href="cars">Search</a></li>
      <li><a href="cars">Live Auctions</a></li>
      <li><a href="cars">Contact</a></li>
      <li><a href="cars">About</a></li>
      <li class="dropdown">
        <a href="cars"class="dropbtn">felixsean@ymail.com</a>
        <div class="dropdown-content">
          <a href="cars">Account</a>
          <a href="#">Bids</a>
          <a href="#">Logout</a>
        </div>
      </li>
    </ul>
</div>
    <c:if test="${!empty car}">
        <c:forEach items="${car}" var="car">
            <div>
                <li class="car">
                    <img src="<c:url value="/resources/images/gti2.jpeg" />" alt="GTI" >
                </li>

                 <lo>
                    <p align="center"><em>Model Name</em> : ${car.make} </p>
                    <br><em>Mileage</em> : ${car.mileage} km </em>
                    <br><em>Transmission</em> : ${car.transmission} </em>
                    <br><em>Price</em> : ${car.priceOffer} </em>
                    <br><em>Highest Price offer</em> : ${car.price} </em>
                </lo>

            </div>
        </c:forEach>
    </c:if>

    <div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;" />
    <br>

<div>


</body>

</html>