<%@include file="header.jsp" %>
<script type="text/javascript" src="<c:url value="/resources/js/customer-validation.js" />"></script>

<div align="center" class="form-group" >
    <div id="wrapper">
        <c:if test="${!empty errors}">
            <c:forEach items="${errors}" var="error">
                <lo>
                   <font color="red">${error.getDefaultMessage()}</font color="red"></br>
                </lo>
            </c:forEach>
        </c:if>
        <c:url var="addCustomer" value="/customer/register/add"></c:url>

        <form name="registerForm" method="POST" action="${addCustomer}" modelAttribute="customer" style="margin-top:50px">
            <div>
               <input type="text" name="firstName" path="firstName" placeholder="First Name" class="formSize" value="${customer.firstName}" />
            </div><br/>
            <div>
               <input type="text" name="lastName" path="lastName" placeholder="Last Name" value="${customer.lastName}"/>
            </div><br/>
            <div>
               <input type="text" name="username" path="username" placeholder="username" value="${customer.username}"/>
            </div><br/>
            <div>
               <input type="text" name="password" path="password" placeholder="password"/>
            </div><br/>
            <div>
             <input type="text" name="password2" path="password2" placeholder="confirm password"/>
            </div><br/>
            <div>
              <input type="text" name="dateOfBirth" path="dateOfBirth" placeholder="Date of birth" value="${customer.dateOfBirth}"/>
            </div><br/>
            <div>
             <input type="text" name="email" path="email" placeholder="email address" value="${customer.email}"/>
            </div><br/>
            <div>
            <input type="text" name="contact" path="contact" placeholder="Cell phone numbers" value="${customer.contact}"/>
            </div><br/>
            <div>
            <input type="text" name="address" path="address" placeholder="physical address" value="${customer.address}"/>
            </div><br/>
            <input type="button" value="Register" class="btnBid" style="float:right;" onclick="validateForm()"/>
        </form>
    </div>
</div>
