<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp" %>

<div class="container">
    <div align="center" class="form-group" >

        <div class="list-group-item" style = "margin-top:20px; margin-bottom:-9px">
            <fieldsets style="padding:50px;">
                <c:choose>
                    <c:when test="${not empty error}">
                        <div id="loginError" class="page-action error">
                            Your login attempt was not successful, try again.<br /> Caused :
                            ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                        </div>
                    </c:when>
                    <c:otherwise>
                        <div >
                            Login with Username and Password
                        </div>
                    </c:otherwise>
                </c:choose>
            </fieldsets>
        </div>

        <form name='f' action="<c:url value='j_spring_security_check' />" method="post" class="list-group-item">
            <table border="0">
                <tr>
                    <td>
                        <div class="form-group">
                            <label style="width:200px;" class="col-xs-1 control-label pull-left" >User name</label>
                            <input type="text" class="form-control" name="j_username"  id="username" placeholder="Username" required/>
                         </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="form-group">
                           <label style="width:200px;" class="col-xs-1 control-label pull-left">Password</label>
                           <input type="password" class="form-control" name="j_password" id="Password" placeholder="Password" required/>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>
                        <div class="form-group">
                            <a href="${pageContext.request.contextPath}/account/create" style="float:left;">Create New Account</a>

                            <button type="submit" class="btn btn-register" name="submit" style="float:right;">Sign in</button>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                        </div>
                    </td>
                </tr>
            </table>

        </form>
    </div>
</div>
<%@ include file="footer.jsp" %>