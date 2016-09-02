<%@include file="header.jsp" %>

<c:url var="addAction" value="/user/add" ></c:url>

    <div align="center" class="form-group" >
        <h4 style="box-shadow: 3px 3px 3px rgba(0,0,0,0.1); width:450px; margin-bottom: 20px; height:80px; color: rgb(0, 51, 204)"> Fill in your personal details below </h4>
            <form method="post" action="${addAction}" modelAttribute="user">
                <table border="0">
                    <tr>
                        <td>
                            <div class="form-group">
                                <label  class="col-xs-2 control-label pull-left">Username</label>
                                <input type="text"  class="form-control" name="username" />
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label  class="col-xs-2 control-label pull-left">password</label>
                                <input type="text"  class="form-control" name="password" />
                            </div>
                        </td>
                    </tr>
                     <tr>
                        <td>
                            <div class="form-group">
                                <label  class="col-xs-2 control-label pull-left">confirm-password</label>
                                <input type="text"  class="form-control" name="password" />
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label  class="col-xs-2 control-label pull-left">firstName</label>
                                <input type="text"  class="form-control" name="firstName" />
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label  class="col-xs-2 control-label pull-left">lastName</label>
                                <input type="text"  class="form-control" name="lastName" />
                            </div>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            <div class="form-group">
                                <label  class="col-xs-2 control-label pull-left">dateOfBirth</label>
                                <input type="text"  class="form-control" name="dateOfBirth" />
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label  class="col-xs-2 control-label pull-left">emailAddress</label>
                                <input type="email"  class="form-control" name="emailAddress" />
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label  class="col-xs-2 control-label pull-left">cellPhoneNumber</label>
                                <input type="text"  class="form-control" name="cellPhoneNumber" />
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label  class="col-xs-2 control-label pull-left">homeAddress</label>
                                <input type="text"  class="form-control" name="homeAddress" />
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td ><input type="submit" class="btnBid" value="Proceed" style="float:right;"/></td>
                    </tr>
                </table>
            </form>
    </div>
</div>

<%@include file="footer.jsp" %>