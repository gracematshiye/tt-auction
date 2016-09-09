<%@include file="header.jsp" %>
<script type="text/javascript" src="<c:url value="/resources/js/customer-validation.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/password-match-check.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>



<div align="center" class="form-group" >
    <div id="wrapper">
        <c:if test="${!empty errors}">
            <c:forEach items="${errors}" var="error">
                <lo>
                   <font color="red">${error.getDefaultMessage()}</font color="red"></br>
                </lo>
            </c:forEach>
        </c:if>

       <!-- <font color="red"><div id="errorMessage"></div></font color="red"> -->
       <p id="returnmessage"></p>

        <c:url var="addCustomer" value="/customer/register/add/carId=${carId}"></c:url>

        <form name="registerForm" method="POST" action="${addCustomer}" modelAttribute="customer" style="margin-top:50px">
            <div>
                <label style="float:left; color:#B22222;">First name</label>
               <input type="text" name="firstName" path="firstName" id="firstName" value="${customer.firstName}"/>
            </div><br/>

            <div>
               <label style="float:left; color:#B22222;">Last name</label>
               <input type="text" name="lastName" path="lastName" id="lastName" value="${customer.lastName}"/>
            </div><br/>

            <div>
               <label style="float:left; color:#B22222;">Username</label>
               <input type="text" name="username" path="username" id="username" value="${customer.username}"/>
               <font color="red">${ussErr}</font></span>
            </div><br/>

            <div>
               <label style="float:left; color:#B22222;">Password</label>
               <input type="text" name="password" path="password" id="password" />
            </div><br/>

            <div>
               <label style="float:left; color:#B22222;">Confirm password</label>
               <input type="text" name="password2" path="password2" id="password2" onkeyup="checkPasswordMatch();"/>
               <font color="red"><div id = "passErr">${ussErr}</div></font>
            </div><br/>

            <div>
               <label style="float:left; color:#B22222;">Date of birth</label>
               <input type="text" name="dateOfBirth" path="dateOfBirth" id="dateOfBirth" placeholder="Date format: (DD/MM/YYYY)" value="${customer.dateOfBirth}"/>
            </div><br/>

            <div>
               <label style="float:left; color:#B22222;">Email address</label>
               <input type="text" name="email" path="email" id="email" value="${customer.email}"/>
               <font color="red">${emlErr}</font></span>
            </div><br/>

            <div>
               <label style="float:left; color:#B22222;">Cell phone</label>
               <input type="text" name="contact" path="contact" id="contact" value="${customer.contact}"/>
            </div><br/>

            <div>
               <label style="float:left; color:#B22222;">Physical address</label>
               <input type="text" name="address" path="address" id="address" value="${customer.address}"/>
            </div><br/>

            <input type="submit" value="Register"  class="btnBid" style="float:right;"/>
            <!-- <input type="submit" value="Register" id="submit" class="btnBid" style="float:right;" onclick="validateForm()"/> -->
        </form>
    </div>
</div>
