<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<link href="<c:url value="/resources/css/viewcar.css" />" rel="stylesheet">

<%@include file="header.jsp" %>
<div class="viewimg">


    <p style="margin-top: 20px;"><img src="<c:url value="/resources/images/${car.id}.jpeg" />" alt="GTI" width="50%" height="40%">
        <em>Description</em>
        This car is just awesome,
        It has the looks, and the power to match.
        For your usual speed enthusiast, who likes getting that kick from matting the throttle to the floor.
        Put this baby in 3rd gear, and press the throttle all the way down to the floor, and tell me if that doesn't thrill you a little bit.
    </p>
     <br>
     <br/>
     <div style="float: right; width: 200px;">
        <p><em>Model Name</em> : ${car.make}
        <br><em>Mileage</em> : ${car.mileage} km
        <br><em>Transmission</em> : ${car.transmission}
        <br><em>Price</em> : ${car.priceOffer}
        <br><em>Highest Price offer</em> : ${car.price}
     </div>
</div>



<%@include file="footer.jsp" %>

