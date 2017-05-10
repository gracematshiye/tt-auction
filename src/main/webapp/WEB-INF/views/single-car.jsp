<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp" %>

<div class="wrapper">

    <div class="pageTittle">
        <h4><a href="${pageContext.request.contextPath}/">Home</a> / <a href="${pageContext.request.contextPath}/cars/make=${car.make}">${car.make}</a> / ${car.model} </h4>
    </div>

    <div class="leftDiv">
        <img id="selectedCar" class="imgSingle" src="<c:url value="/resources/images/${car.id}.jpeg" />" alt="GTI">
    </div>

    <div class="thumbs">
        <img class="imgPreview selected" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}.jpeg" />" alt="Click to preview">
        <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_2.jpeg" />" alt="Click to preview">
        <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_3.jpeg" />" alt="Click to preview">
        <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_4.jpeg" />" alt="Click to preview">
        <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_5.jpeg" />" alt="Click to preview">
        <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_6.jpeg" />" alt="Click to preview">
        <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_7.jpeg" />" alt="Click to preview">
    </div>

    <div class="bidWrapper">
        <div class="bottomDiv">
            <a href="${pageContext.request.contextPath}/cars/bid/${car.id}"><input type="button" value="Bid this Car" id="btnBid" class="btn btn-bid" /></a>
        </div>
    </div>

    <div class="rightDiv" style="margin-right: 15px;">
         <div>
            <h3><em>Vehicle Details</em></h3>
            <p><em>Model Name</em> : ${car.model}
            <br><em>Make</em> : ${car.make}
            <br><em>Transmission</em> : ${car.transmission}
            <br><em>Year</em> : ${car.year}
            <br><em>Condition</em> : ${car.condition}
            <br><em>Fuel Type</em> : ${car.fuel}
            <br><em>Transmission</em> : ${car.transmission}
            <br><em>Color</em> : ${car.colour}
            <br><em>Price</em> : ${car.price}
         </div>
         <p>
            <h3><em>Description</em></h3>
            ${car.description}
         </p>
    </div>

</div>


