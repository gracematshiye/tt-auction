<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<spring:url value="/resources/js/jquery.min.js" var="jqueryJS"/>
<link rel="stylesheet" type="text/css" href="/resources/css/styles.css"/>
<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/viewcar.css" />" rel="stylesheet">

<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous" >

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

<div style="styles">
    <ul>
        <li class="logo">
            <a href="${pageContext.request.contextPath}/cars">TT's Online Auction</a>
        </li>

      <li class="home"><a href="${pageContext.request.contextPath}/cars">Home</a></li>

  <!--
      <li><a href="#">Live Auctions</a></li>
      <li><a href="#">Testimonials</a></li>
      <li><a href="#">Financing</a></li>

      <c:choose>
          <c:when test="${LoggedIn == true}">
            <li class="dropdown">
                <a href="#"class="dropbtn">felixsean@ymail.com</a>
                <div class="dropdown-content">
                  <a href="#">Account</a>
                  <a href="#">My Bids</a>
                  <a href="#">Logout</a>
                </div>
            </li>
          </c:when>
          <c:otherwise>
            <li class="login"><a href="#">Login</a></li>
          </c:otherwise>
       </c:choose>
   -->

    </ul>
</div>