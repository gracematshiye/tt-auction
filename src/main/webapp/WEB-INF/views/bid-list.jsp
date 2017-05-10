<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp" %>

<div class = "container">
    <div class = "container-fluid">
     <c:if test="${!empty bidList}">
       <a href = "${pageContext.request.contextPath}/cars/bid/remove-all" id="btnBid" class="label label-default" style="float:left;height:25px;width:125px;padding-bottom:10px;padding-top:7px;"> Empty Cart </a>
       <a href = "${pageContext.request.contextPath}/user-profile/${pageContext.request.userPrincipal.name}" id="btnBid" class="label label-default" style="float:right;height:25px;width:125px;padding-bottom:10px;padding-top:7px;"> Make Order </a>
    </c:if>

        <div class="row">
            <div class="col-xs-12">
                <div class="table-responsive">
                    <c:choose>
                        <c:when test="${!empty bidList}">
                            <c:forEach items="${bidList}" var="car">
                                 <div class="list-group-item" style = "margin-top:10px; margin-bottom:10px">
                                    <table class="table table-hover  results">
                                        <thead>
                                            <tr>
                                                <th class="col-md-2 col-xs-2">
                                                    Car Name
                                                </th>

                                                <th class="col-md-2 col-xs-2">
                                                    Car Transmission
                                                </th>

                                                 <th class="col-md-2 col-xs-2">
                                                 Quantity
                                                 </th>

                                                 <th class="col-md-2 col-xs-2">
                                                 Car Price
                                                 </th>

                                                <th class="col-md-1 col-xs-1">
                                                    <a href="${pageContext.request.contextPath}/cars/bid/${car.value.bid_id}/remove" class = "glyphicon glyphicon-remove"  style = "margin-left: 70px;"></a>
                                                </th>
                                            </tr>
                                        </thead>
                                       <tbody>
                                            <tr>
                                                <td>
                                                    ${car.key.make}
                                                </td>

                                                <td >
                                                    ${car.key.transmission}
                                                </td>

                                                <td >
                                                    ${car.key.quantity}
                                                </td>
                                                <td>
                                                    ${car.key.price}
                                                </td>
                                                <td>
                                                </td>

                                                <td>
                                                    <a href="${pageContext.request.contextPath}/cars/car/${car.key.id}" >
                                                        <img class="imgPreview"  src="<c:url value="/resources/images/${car.key.id}.jpeg" />" alt="Click to preview" style = "width: 140; height: 110;">
                                                    </a>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </c:forEach>
                        </c:when>
                        <c:otherwise>
                            <div class="list-group-item" style = "margin-top:10px; margin-bottom:10px">
                                <center>
                                    <div class="icon-large icon-shopping-cart"><h2> Biding list is empty</h2></div>
                                    <h1><span class="glyphicon glyphicon-shopping-cart" ></span></h1>
                               </center>
                            </div>
                        </c:otherwise>
                    </c:choose>
                </div>
            </div>
        </div>
         <c:choose>
            <c:when test="${!empty bidList}">
                <span class="label label-default" style="float:right; width:200px; ">
                    <h5>
                    Total: R ${total}
                    </h5>
                </span>
            </c:when>
            <c:otherwise>
            </c:otherwise>
        </c:choose>

    </div>
</div>
<%@include file="footer.jsp" %>
