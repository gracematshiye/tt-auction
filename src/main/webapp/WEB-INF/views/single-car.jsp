<%@include file="header.jsp" %>

<link href="<c:url value="/resources/css/viewcar.css" />" rel="stylesheet">

<script type="text/javascript" src="<c:url value="/resources/js/viewcar.js" />"></script>

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
        <c:choose>
            <c:when test="${!empty uname}">

                <c:url var="addBid" value="/bid/carId=${carId}&uname=${uname}"></c:url>
                <form name="registerForm" method="POST" action="${addBid}" modelAttribute="addBid" style="margin-top:50px">
                    <div class="topDiv">
                        <div id="offer"><!-- Offer amount input field -->
                            <input type="number" name="offer" id="offer" path="offer" required/>
                        </div>

                    </div>
                    <div class="bottomDiv"><!-- Button -->
                        <input type="submit" id="btnBid" value="Bid Now" class="btn btn-bid" />
                    </div>
                </form>

            </c:when>
            <c:otherwise>
                <div class="bottomDiv">
                    <a href="${pageContext.request.contextPath}/customer/register/carId=${car.id}"><input type="button" value="Bid this Car" id="btnBid" class="btn btn-bid" /></a>
                </div>
            </c:otherwise>
        </c:choose>
    </div>
    <div class="rightDiv">
         <div>
            <h3><em>Vehicle Details</em></h3>
            <p><em>Model Name</em> : ${car.model}
            <br><em>Make</em> : ${car.make}
            <br><em>Mileage</em> : ${car.mileage} km
            <br><em>Transmission</em> : ${car.transmission}
            <br><em>Year</em> : ${car.year}
            <br><em>Condition</em> : ${car.condition}
            <br><em>Fuel Type</em> : ${car.fuel}
            <br><em>Transmission</em> : ${car.transmission}
            <br><em>Color</em> : ${car.colour}
            <br><em>Price</em> : ${car.price}
            <br><em>Highest Price offer</em> : ${car.priceOffer}
         </div>
         <p>
            <h3><em>Description</em></h3>
            ${car.description}
         </p>
    </div>
</div>

<!--<div class="bidWrapper">
    <c:choose>
        <c:when test="${!empty uname}">

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
             <div><img src="<c:url value="/resources/images/1_6.jpeg" />" alt="Photo Thumb" /></div>
             <div><img src="<c:url value="/resources/images/1_7.jpeg" />" alt="Photo Thumb" /></div>
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

