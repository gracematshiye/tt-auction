<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page pageEncoding="UTF-8" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="security" %>

<!DOCTYPE html>
<html>
     <head>
            <meta charset="utf-8">
            <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.min.css' />"  />
            <link rel="stylesheet" href="<c:url value='/resources/css/common.css' />"  />
            <link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css' />"  />
            <link rel="stylesheet" href="<c:url value='/resources/css/styles.css' />"  />
            <link rel="stylesheet" href="<c:url value='/resources/css/viewcar.css' />" />

            <script type="text/javascript" src="<c:url value='/resources/js/cookie_notification.js' />"></script>
            <script type="text/javascript" src="<c:url value='/resources/js/jquery.cookie.js' />" ></script>
            <script type="text/javascript" src="<c:url value='/resources/js/jquery.min.js' />" ></script>
            <script type="text/javascript" src="<c:url value='/resources/js/jquery-plugin.js' />" ></script>
            <script type="text/javascript" src="<c:url value='/resources/js/register-validation.js' />" ></script>
            <script type="text/javascript" src="<c:url value='/resources/js/validateOffer.js' />" ></script>
            <script type="text/javascript" src="<c:url value='/resources/js/viewCar.js' />" ></script>


            <style>
            body {margin: 0;}

            li.login {
                float: right;
                display: inline-block;
                padding-right: 10%;
            }

            li.welcome {
                float: left;
                color:green;
            }

            li.home {
                padding-left: 35px;
            }

            li.
            body {margin:0;}

            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #ab3a3a;
                top: 0;
                width: 100%;
            }

            li {
                float: left;
            }

            li a {
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            li a:hover:not(.active) {
                background-color: #9c3333;
            }

            .active {
                background-color: #4CAF50;
            }

            li a, .dropbtn {
                display: inline-block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            li a:hover, .dropdown:hover .dropbtn {
                background-color: #9c3333;
            }

            li.dropdown {
                display: inline-block;
                padding-left: 5%;
            }

            li.car {
                list-style: none;
                float: none;
                padding-top: 2em;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            }

            .dropdown-content a {
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                text-align: left;
            }

            .dropdown-content a:hover {
                background-color: #c14a4a
            }

            .dropdown:hover .dropdown-content {
                display: block;
            }

            .logo {
                font-family: cursive;
                color: #d62929;
                font-weight: 700;
                font-style: normal;
                margin: 10px;
                margin-top: 0px;
                margin-bottom: 0px;
            }

            img {
                display: block;
                margin: 0 auto;
                width:460px;
                height:345px;
            }

            a.car {
                background-color: red;
            }


            li .homeBar {
                display: inline-block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }
            </style>
            <style>
              #wrapper {
                    width:450px;
                    margin:0 auto;
                    font-family:Verdana, sans-serif;
                }

                legend {
                    color:#0481b1;
                    font-size:16px;
                    padding:0 10px;
                    background:#fff;
                    -moz-border-radius:4px;
                    box-shadow: 0 1px 5px rgba(4, 129, 177, 0.5);
                    padding:5px 10px;
                    text-transform:uppercase;
                    font-family:Helvetica, sans-serif;
                    font-weight:bold;

                }
                fieldset {
                    border-radius:4px;
                    background: #fff;
                    background: -moz-linear-gradient(#fff, #f9fdff);
                    background: -o-linear-gradient(#fff, #f9fdff);
                    background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#fff), to(#f9fdff)); /
                    background: -webkit-linear-gradient(#fff, #f9fdff);
                    padding:20px;
                    border-color:rgba(4, 129, 177, 0.4);
                }
                input,
                textarea {
                    color: #373737;
                    background: #fff;
                    border: 1px solid #CCCCCC;
                    color: #aaa;
                    font-size: 14px;
                    line-height: 1.2em;
                    margin-bottom:15px;

                    -moz-border-radius:4px;
                    -webkit-border-radius:4px;
                    border-radius:4px;
                    box-shadow: 0 1px 2px rgba(0, 0, 0, 0.1) inset, 0 1px 0 rgba(255, 255, 255, 0.2);
                }
                input[type="text"],
                input[type="password"]{
                    padding: 8px 6px;
                    height: 35px;
                    width:450px;
                }
                input[type="text"]:focus,
                input[type="password"]:focus {
                    background:#f5fcfe;
                    text-indent: 0;
                    z-index: 1;
                    color: #373737;
                    -webkit-transition-duration: 400ms;
                    -webkit-transition-property: width, background;
                    -webkit-transition-timing-function: ease;
                    -moz-transition-duration: 400ms;
                    -moz-transition-property: width, background;
                    -moz-transition-timing-function: ease;
                    -o-transition-duration: 400ms;
                    -o-transition-property: width, background;
                    -o-transition-timing-function: ease;
                    width: 460px;

                    border-color:#ccc;
                    box-shadow:0 0 5px rgba(4, 129, 177, 0.5);
                    opacity:0.6;
                }

                /**
                input[type="submit"]{
                    background: #222;
                    border: none;
                    text-shadow: 0 -1px 0 rgba(0,0,0,0.3);
                    text-transform:uppercase;
                    color: #eee;
                    cursor: pointer;
                    font-size: 15px;
                    margin: 5px 0;
                    padding: 5px 22px;
                    -moz-border-radius: 4px;
                    border-radius: 4px;
                    -webkit-border-radius:4px;
                    -webkit-box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
                    -moz-box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
                    box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
                }
                **/
                textarea {
                    padding:3px;
                    width:96%;
                    height:100px;
                }
                textarea:focus {
                    background:#ebf8fd;
                    text-indent: 0;
                    z-index: 1;
                    color: #373737;
                    opacity:0.6;
                    box-shadow:0 0 5px rgba(4, 129, 177, 0.5);
                    border-color:#ccc;
                }
                .small {
                    line-height:14px;
                    font-size:12px;
                    color:#999898;
                    margin-bottom:3px;
                }

            #fieldName{
                width:300px;
                color: #ab3a3a;
            }

            .btn-register {
                background-color: #ab3a3a;
                border-color: #4cae4c;
                float: right;
            }
            .btn-basic {
                background-color: #ab3a3a;
                border-color: #2e6da4;
                float: left;
             }
            .btn {
                color: #fff;
                display: inline-block;
                padding: 6px 12px;
                margin-bottom: 0;
                font-size: 14px;
                font-weight: 400;
                line-height: 1.42857143;
                text-align: center;
                white-space: nowrap;
                vertical-align: middle;
                cursor: pointer;
                border: 1px solid transparent;
                border-radius: 4px;
                -webkit-appearance: button;
            }
            </style>
            <style>
            .viewimg {

            }
            .wrapper {
                float: center;
                margin: auto;
                width: 65em;
            }
            .bidWrapper {
                float: left;
                margin-left: 35em;
            }
            .leftDiv {
                float: left;
                width: 60%;
            }
            .rightDiv {
                float: right;
                width: 21%;
                margin-left: 10px;
                margin-top: -40em;
                margin-right: 20px;
            }
            img {
                float: left;
                margin: 20px 20px 15px 20px;
                display: block;
                width:600px;
                height:444px;
            }
            .imgSingle {
                width:650px;
                height:456px;
            }
            .btn {
                color: #fff;
                background-color: #5cb85c;
                border-color: #4cae4c;
                display: inline-block;
                padding: 6px 12px;
                margin-bottom: 0;
                font-size: 14px;
                font-weight: 400;
                line-height: 1.42857143;
                text-align: center;
                white-space: nowrap;
                vertical-align: middle;
                cursor: pointer;
                border: 1px solid transparent;
                border-radius: 4px;
                -webkit-appearance: button;
            }
            .btn-bid {
                background-color: #5cb85c;
                border-color: #4cae4c;
            }
            .btn-bid:hover {
                background-color: #449d44;
                border-color: #398439;
            }
            .btn-bid:active {
            	position:relative;
            	top:1px;
                color: #fff;
                background-color: #5cb85c;
                border-color: #4cae4c;
            }
            .thumbs {
                display: inline-block;
                float:left;
                width: 700px;
                margin: 0 auto;
                margin-left: 15px;
                margin-top: -10px;
                position: relative;
                background-position: center;
                background-repeat: no-repeat;
                border: 0;
                box-sizing: border-box;
            }
            .imgPreview {
                float: left;
                margin: 5px;
                display: block;
                width:122px;
                height:72px;
                opacity: .65;
            }
            .imgPreview:hover {
                cursor: pointer;
                border: 2px;
                opacity: 1;
            }
            .selected {
                box-shadow: 0 2px 5px rgba(0,0,0,.5);
                border-width: 2px;
                border-color: #1867c3;
                border: 5px;
                opacity: 1;
            }

            .mask6{
            	position:absolute;
            	left:50%;
            	margin-left:-120px;
            	width:240px;
            	height:180px;
            	overflow:hidden;
            }
            #box7{
            	position:absolute;
            }
            #box7 span{
            	display:block;
            	float:left;
            }

            .sample{padding:20px 30px; margin:4px 0 25px 0; border:1px solid #e1e1e1}

            .pageTittle {
                height: 20px;
                float: left;
                padding-left: 2em;
                padding-right: 40em;
                padding-bottom: 1em;
            }
            .pageTittle a {
                text-decoration:none;
            }
            </style>
        </head>

    <body>

        <div id="about_notification">
            <span id="cookie_notification" > Cookies on this website: We use cookies to give the best experience when you use our website.
                If you decide to continue using our website without changing the settings,
                we will assume that you are happy to receive all the cookies from our website.</span>
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