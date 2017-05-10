<%@include file="../header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="container">
    <div align="center" class="form-group" >

        <div class="list-group-item" style = "margin-top:20px; margin-bottom:-9px">
           <center><h3>Create an Account here.</h3></center>
        </div>

        <c:url var="addCustomer" value="/account/create/add"></c:url>
        <form name="registerForm" method="post" action="${addCustomer}" modelAttribute="customer" style="margin-top:50px" class="list-group-item">
            <table border="0">
                <tr>
                    <td>
                        <div class="form-group">
                            <label class="col-xs-1 control-label pull-left" style="width:200px;">First name</label>
                           <input type="text" class="form-control" name="firstName" path="firstName" id="firstName"  value="${customer.firstName}" required/>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="form-group">
                           <label class="col-xs-1 control-label pull-left" style="width:200px;">Last name</label>
                           <input type="text" class="form-control" name="lastName" path="lastName" id="lastName"  value="${customer.lastName}" required/>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="form-group">
                           <label class="col-xs-2 control-label pull-left" style="width:200px;">Username</label>
                           <input type="text" class="form-control" name="username" path="username" id="username" value="${customer.username}" required/>
                           <font color="red">${ussErr}</font>
                        </div>
                     </td>
                 </tr>
                 <tr>
                     <td>
                        <div class="form-group">
                           <label class="col-xs-2 control-label pull-left" style="width:200px;">Password</label>
                           <input type="password" class="form-control" name="password" path="password" id="password" required />
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="form-group">
                           <label class="col-xs-2 control-label pull-left" style="width:200px;">Confirm password</label>
                           <input type="password" class="form-control" name="password2" path="password2" id="password2" onfocusout="validatePassword();" required/>
                           <font color="red"><div id = "passErr" ></div></font>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="form-group">
                           <label class="col-xs-2 control-label pull-left" style="width:200px;">Date of birth</label>
                           <input type="text" class="form-control" name="dateOfBirth" path="dateOfBirth" id="dateOfBirth" placeholder="In format: (DD/MM/YYYY)" value="${customer.dateOfBirth}" required/>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="form-group">
                           <label class="col-xs-2 control-label pull-left" style="width:200px;">Email address</label>
                           <input type="text" class="form-control" name="email" path="email" id="email" value="${customer.email}" onfocusout="validateEmail()" required/>
                           <font color="red"><div id = "emlErr" >${emlErr}</div></font>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="form-group">
                           <label class="col-xs-2 control-label pull-left" style="width:200px;">Cell phone</label>
                           <input type="text" class="form-control" name="contact" path="contact" id="contact" value="${customer.contact}" onfocusout="validatePhone()" required/>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="form-group">
                           <label class="col-xs-2 control-label pull-left" style="width:200px;"> Physical address</label>
                           <input type="text" class="form-control" name="address" path="address" id="address" value="${customer.address}" required/>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <a href="${pageContext.request.contextPath}/"><input type="button" value="Cancel" id="btnBid" class="btn btn-basic" /></a>
                        <input type="submit" value="Register" id="btnBid" class="btn btn-register" style="float:right;"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>

<%@include file="../footer.jsp" %>
