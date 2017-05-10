<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="security" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css' />" type="text/css" />
        <link rel="stylesheet" href="<c:url value='/resources/css/common.css' />" type="text/css" />
        <link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css' />" type="text/css" />
        <link rel="stylesheet" href="<c:url value='/resources/css/styles.css' />" type="text/css" />
        <link rel="stylesheet" href="<c:url value='/resources/css/viewcar.css' />" type="text/css" />

        <script type="text/javascript" src="<c:url value='/resources/js/cookie_notification.js' />"></script>
        <script type="text/javascript" src="<c:url value='/resources/js/jquery.cookie.js' />" ></script>
        <script type="text/javascript" src="<c:url value='/resources/js/jquery.min.js' />" ></script>
        <script type="text/javascript" src="<c:url value='/resources/js/jquery-plugin.js' />" ></script>
        <script type="text/javascript" src="<c:url value='/resources/js/register-validation.js' />" ></script>
        <script type="text/javascript" src="<c:url value='/resources/js/validateOffer.js' />" ></script>
        <script type="text/javascript" src="<c:url value='/resources/js/viewCar.js' />" ></script>
    </head>

    <body>

        <div id="about_notification">
            <span id="cookie_notification" > Cookies on this website: We use cookies to give the best experience when you use our website.
                If you decide to continue using our website without changing the settings,
                we will assume that y ou are happy to receive all the cookies from our website.</span>
            <a id="close-cookie-law" class = "glyphicon glyphicon-remove" href="/" onclick="hideNotification()"></a>
            <br />
        </div>

        <div style="styles">
            <ul>
                <li>
                    <a href="${pageContext.request.contextPath}/" style="font-size: 1.2em;color:bisque;">Ralson's Online Auction</a>
                </li>

              <li class="home"><a href="${pageContext.request.contextPath}/">Home</a></li>

              <security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
                <li class="cart"><a href="${pageContext.request.contextPath}/cars/bid-list">Cart ${bidSize} </a></li>
              </security:authorize>

              <security:authorize ifAnyGranted="ROLE_ADMIN">
                <li class="cart"><a href="${pageContext.request.contextPath}/admin/car/manage">Product Management</a></li>
              </security:authorize>

              <security:authorize ifNotGranted="ROLE_USER,ROLE_ADMIN">
                <li class="login"><a href="${pageContext.request.contextPath}/login">Login</a></li>
              </security:authorize>

              <security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
                <li class="login"><a href="<c:url value="j_spring_security_logout" />" class="brand">Logout</a></li>
              </security:authorize>

              <security:authorize ifAnyGranted="ROLE_USER,ROLE_ADMIN">
                <li class="welcome"><a href="${pageContext.request.contextPath}/user-profile/${pageContext.request.userPrincipal.name}" class="brand">Welcome: <security:authentication property="principal.username"/>!</a></li>
              </security:authorize>

            </ul>
        </div>