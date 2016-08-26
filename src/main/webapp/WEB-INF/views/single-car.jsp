<%@include file="header.jsp" %>

<c:if test="${!empty cars}">
    <c:forEach items="${cars}" var="car">
        <div>
             <lo>

                <br/> ${car.mileage} km
                <br/><em>Transmission</em> : ${car.transmission}
                <br/><em>Price</em> : ${car.priceOffer}
                <br/><em>Highest Price offer</em> : ${car.price}
            </lo>
        </div>
    </c:forEach>
</c:if>

<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;" />
<br>

