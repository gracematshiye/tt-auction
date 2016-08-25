<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html lang="en">

<head>
<!-- let's add tag srping:url -->

<spring:url value="/resources/css/testCss.css" var="stylingCSS" />
<spring:url value="/resources/js/testJs.js" var="javascriptJS" />
<spring:url value="/resources/js/jquery.min.js" var="jqueryJS"/>

<link href="${stylingCSS}" rel="stylesheet" />
<script src="${jqueryJS}"></script>
<script src="${javascriptJS}"></script>

<!-- Finish adding tags -->
</head>

<body>${message}

    <div
    style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">

        ${message}
        <h2>Checkout this font color. Loaded from 'testCss.css' file under '/WebContent/resources/' folder</h2>

        <div id="javascriptMessage"></div>
    </div>
</body>

</html>