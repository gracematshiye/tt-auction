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
                        <a href="${pageContext.request.contextPath}/cars/car/${car.id}" >
                            <img src="${car.imageUrl}" alt="car" >
                        </a>
                    </li>
                     <lo>
                        <p><em>Model Name</em> : ${car.make}
                        <br><em>Transmission</em> : ${car.transmission}
                        <br><em>Price</em> : ${car.price}
                    <lo>
                </div>
                <br>

                <div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">

                <br>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <div class="list-group-item" style = "margin-top:10px; margin-bottom:10px;margin-left:150px;margin-right:150px;">
                <center>
                    <div class="icon-large icon-shopping-cart"><h2> We are out of stock!</h2></div>
                    <h1><span class="glyphicon glyphicon-shopping-cart" ></span></h1>
               </center>
            </div>
        </c:otherwise>
    </c:choose>

<%@include file="footer.jsp" %>
