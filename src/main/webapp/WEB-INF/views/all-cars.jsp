<%@include file="header.jsp" %>

    <c:choose>
    <c:when test="${!empty carList}">
        <c:forEach items="${carList}" var="car">
            <div align="center">
                <div class="leftDiv">

                </div>
                <div class="rightDiv">

                </div>

                <li class="car">
                    <a href="${pageContext.request.contextPath}/cars/${car.id}" >
                        <img src="<c:url value="/resources/images/${car.id}.jpeg" />" alt="GTI" >
                    </a>
                </li>
                 <lo>
                    <p><em>Model Name</em> : ${car.make}
                    <br><em>Mileage</em> : ${car.mileage} km
                    <br><em>Transmission</em> : ${car.transmission}
                    <br><em>Price</em> : ${car.price}
                    <br><em>Highest Price offer</em> : ${car.priceOffer}
                <lo>
            </div>
            <br>

            <div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">

            <br>
        </c:forEach>
    </c:when>
    <c:otherwise>
    </c:otherwise>
</c:choose>
<div>

<%@include file="footer.jsp" %>
