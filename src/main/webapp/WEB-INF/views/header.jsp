<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/form.css" />" rel="stylesheet">

<spring:url value="/resources/js/jquery.min.js" var="jqueryJS"/>

<div style="styles">
    <ul>
        <li class="logo">
            <a href="${pageContext.request.contextPath}/">TT's Online Auction</a>
        </li>

      <li class="home"><a href="${pageContext.request.contextPath}/">Home</a></li>
      <li class="home"><a href="${pageContext.request.contextPath}/">View Car</a></li>

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