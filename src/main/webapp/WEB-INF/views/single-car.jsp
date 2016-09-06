<%@include file="header.jsp" %>

<link href="<c:url value="/resources/css/viewcar.css" />" rel="stylesheet">

<script type="text/javascript" src="<c:url value="/resources/js/viewcar.js" />"></script>

<div class="pageTittle">
    <!--<h2>View Car Details</h2>-->
    <h4><a href="${pageContext.request.contextPath}/">Home</a> / <a href="${pageContext.request.contextPath}/cars/make=${car.make}">${car.make}</a> / ${car.model} </h4>
    <!--would be clickable links [TT's Home / Make]--->
</div>

<div class="wrapper">
    <div class="leftDiv">
        <img id="selectedCar" class="imgSingle" src="<c:url value="/resources/images/${car.id}.jpeg" />" alt="GTI">
    </div>
    <div class="rightDiv">
        <p>
            <h3><em>Description</em></h3>
            ${car.description}
        </p>
         <div>
            <h3><em>Vehicle Details</em></h3>
            <p><em>Model Name</em> : ${car.model}
            <br><em>Mileage</em> : ${car.mileage} km
            <br><em>Transmission</em> : ${car.transmission}
            <br><em>Price</em> : ${car.priceOffer}
            <br><em>Highest Price offer</em> : ${car.price}
         </div>
    </div>

    <div class="thumbs">
        <div class="wrap">
            <img class="imgPreview active" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}.jpeg" />" alt="Click to preview">
            <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_2.jpeg" />" alt="Click to preview">
            <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_3.jpeg" />" alt="Click to preview">
            <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_4.jpeg" />" alt="Click to preview">
            <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_5.jpeg" />" alt="Click to preview">
            <img class="imgPreview" onClick="selectCar(this)" src="<c:url value="/resources/images/${car.id}_6.jpeg" />" alt="Click to preview">
        </div>
    </div>
<div class="bidWrapper">
    <a href="${pageContext.request.contextPath}/customer/register" value="Bid" class="btnBid" width="20px">Bid this car</a>
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
</div>

<div class="sample">
    	<div class="mask6">
    		<div id="box7">
    			<span><img src="<c:url value="/resources/images/1.jpeg" />" alt="Photo" /></span>
    			<span><img src="<c:url value="/resources/images/1_2.jpeg" />" alt="Photo" /></span>
    			<span><img src="<c:url value="/resources/images/1_3.jpeg" />" alt="Photo" /></span>
    			<span><img src="<c:url value="/resources/images/1_4.jpeg" />" alt="Photo" /></span>
    			<span><img src="<c:url value="/resources/images/1_5.jpeg" />" alt="Photo" /></span>
    			<span><img src="<c:url value="/resources/images/1_6.jpeg" />" alt="Photo" /></span>
    		</div>
    	</div>

    	<div id="thumbs7">
    		<div class="thumbs">
    			<div><img src="<c:url value="/resources/images/1.jpeg" />" alt="Photo Thumb" /></div>
    			<div><img src="<c:url value="/resources/images/1_2.jpeg" />" alt="Photo Thumb" /></div>
    			<div><img src="<c:url value="/resources/images/1_3.jpeg" />" alt="Photo Thumb" /></div>
    			<div><img src="<c:url value="/resources/images/1_4.jpeg" />" alt="Photo Thumb" /></div>
    			<div><img src="<c:url value="/resources/images/1_5.jpeg" />" alt="Photo Thumb" /></div>
    		</div>

    		<div id="thumbs_mask7"></div>

    		<p id="thumbs_handles7">
    			<span></span>
    			<span></span>
    			<span></span>
    			<span></span>
    			<span></span>
    			<span></span>
    			<span></span>
    			<span></span>
    		</p>
    	</div>
    </div>-->