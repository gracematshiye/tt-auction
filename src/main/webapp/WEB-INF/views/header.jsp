<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<spring:url value="/resources/js/jquery.min.js" var="jqueryJS"/>
<link rel="stylesheet" type="text/css" href="/resources/css/styles.css"/>
<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">

<div style="styles">
    <ul>
        <li class="logo">
            <a href="${pageContext.request.contextPath}/cars" class="dropbtn">TT's Online Auction</a>
        </li>
      <li><a href="${pageContext.request.contextPath}/cars">Home</a></li>
      <li><a href="#">Search</a></li>
      <li><a href="#">Live Auctions</a></li>
      <li><a href="#">Contact</a></li>
      <li><a href="#">About</a></li>
      <li class="dropdown">
        <a href="#"class="dropbtn">felixsean@ymail.com</a>
        <div class="dropdown-content">
          <a href="#">Account</a>
          <a href="#">Bids</a>
          <a href="#">Logout</a>
        </div>
      </li>
    </ul>
</div>