<%@include file="header.jsp" %>

<script type="text/javascript" src="<c:url value="/resources/js/validation/register-validation.js" />"></script>

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
                <label style="float:left; color:#008000;">First name</label>
               <input type="text" name="firstName" path="firstName" id="firstName"  value="${customer.firstName}" required/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Last name</label>
               <input type="text" name="lastName" path="lastName" id="lastName"  value="${customer.lastName}" required/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Username</label>
               <input type="text" name="username" path="username" id="username" value="${customer.username}" required/>
               <font color="red">${ussErr}</font><br/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Password</label>
               <input type="password" name="password" path="password" id="password" required />
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Confirm password</label>
               <input type="password" name="password2" path="password2" id="password2" onfocusout="validatePassword();" required/>
               <font color="red"><div id = "passErr" ></div></font><br/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Date of birth</label>
               <input type="text" name="dateOfBirth" path="dateOfBirth" id="dateOfBirth" placeholder="In format: (DD/MM/YYYY)" value="${customer.dateOfBirth}" required/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Email address</label>
               <input type="text" name="email" path="email" id="email" value="${customer.email}" onfocusout="validateEmail()" required/>
               <font color="red"><div id = "emlErr" ></div></font><br/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000; margin-top -8px">Cell phone</label>
               <input type="text" name="contact" path="contact" id="contact" value="${customer.contact}" onfocusout="validatePhone()" required/>
               <font color="red"><div id = "cntErr" ></div></font><br/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Physical address</label>
               <input type="text" name="address" path="address" id="address" value="${customer.address}" required/>
            </div><br/>

            <a href="${pageContext.request.contextPath}/cars/${carId}"><input type="button" value="Cancel" id="btnBid" class="btn btn-basic" /></a>
            <input type="submit" value="Register" id="btnBid" class="btn btn-register" />
            <!-- <input type="submit" value="Register" id="submit" class="btnBid inactive active" style="float:right;" onclick="validateForm()"/> -->
        </form>
    </div>
</div>
