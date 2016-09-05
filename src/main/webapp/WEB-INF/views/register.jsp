<%@include file="header.jsp" %>

<div align="center" class="form-group" >
    <div id="wrapper">
        <center>
           <c:url var="addAction" value="/customer/add" ></c:url>
           <form method="post" action="${addAction}" modelAttribute="customer">
               <fieldset>
                   <div>
                       <input type="text" name="firstName" placeholder="First Name" class="formSize"/>
                   </div><br/>
                   <div>
                       <input type="text" name="lastName" placeholder="Last Name"/>
                   </div><br/>
                   <div>
                       <input type="text" name="username" placeholder="username"/>
                   </div><br/>
                   <div>
                       <input type="text" name="password" placeholder="password"/>
                   </div><br/>
                   <div>
                     <input type="text" name="password2" placeholder="confirm password"/>
                  </div><br/>
                   <div>
                      <input type="text" name="dateOfBirth" placeholder="Date of birth"/>
                   </div><br/>
                   <div>
                     <input type="text" name="email" placeholder="email address"/>
                   </div><br/>
                   <div>
                    <input type="text" name="contact" placeholder="Cell phone numbers"/>
                   </div><br/>
                   <div>
                    <input type="text" name="address" placeholder="physical address"/>
                   </div><br/>

                   <input type="submit" value="Register" name="submit" class="btnBid" style="float:right;"/>
               </fieldset>
           </form>
       </center>
    </div>
</div>


<%@include file="footer.jsp" %>