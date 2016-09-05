<%@include file="header.jsp" %>

<link href="<c:url value="/resources/css/viewcar.css" />" rel="stylesheet">

<div class="wrapper">
    <div class="leftDiv">
        <img class="imgSingle" src="<c:url value="/resources/images/${car.id}.jpeg" />" alt="GTI">
    </div>
    <div class="rightDiv">
        <p>
            <em>Description</em>
            This car is just awesome,
            It has the looks, and the power to match.
            For your usual speed enthusiast, who likes getting that kick from matting the throttle to the floor.
            Put this baby in 3rd gear, and press the throttle all the way down to the floor, and tell me if that doesn't thrill you a little bit.
        </p>
         <br>
         <br/>
         <div>
            <p><em>Model Name</em> : ${car.make}
            <br><em>Mileage</em> : ${car.mileage} km
            <br><em>Transmission</em> : ${car.transmission}
            <br><em>Price</em> : ${car.priceOffer}
            <br><em>Highest Price offer</em> : ${car.price}
         </div>
    </div>

    <div class="thumbs">
        <div class="wrap">
            <img class="imgPreview" src="<c:url value="/resources/images/${car.id}.jpeg" />" alt="GTI">
            <img class="imgPreview" src="<c:url value="/resources/images/${car.id}_2.jpeg" />" alt="GTI">
            <img class="imgPreview" src="<c:url value="/resources/images/${car.id}_3.jpeg" />" alt="GTI">
            <img class="imgPreview" src="<c:url value="/resources/images/${car.id}_4.jpeg" />" alt="GTI">
            <img class="imgPreview" src="<c:url value="/resources/images/${car.id}_5.jpeg" />" alt="GTI">
            <img class="imgPreview" src="<c:url value="/resources/images/${car.id}_6.jpeg" />" alt="GTI">
        </div>
    </div>
<div class="bidWrapper">
    <a href="${pageContext.request.contextPath}/customer/register" value="Bid" class="btnBid" width="20px">Bid</a>
</div>

</div>

<!--<div class="bidWrapper">
    <c:choose>
        <c:when test="${!empty userId}">
            <div class="topDiv">
                <input type="text" name="Hello" />
            </div>
            <div class="bottomDiv">
                <a href="${pageContext.request.contextPath}/cars/bid/carId=${car.id}&userId=${userId}&offer=${offer}" value="Bid" class="btnBid" width="20px">Bid</a>
            </div>
        </c:when>
        <c:otherwise>
            <div class="bottomDiv">
                <a href="${pageContext.request.contextPath}/cars/bid/carId=${car.id}" value="Bid" class="btnBid" width="20px">Bid</a>
            </div>
        </c:otherwise>
    </c:choose>
</div>-->