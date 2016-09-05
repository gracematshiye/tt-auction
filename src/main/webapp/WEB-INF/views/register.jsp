<%@include file="header.jsp" %>

<div align="center" class="form-group" >
    <div id="wrapper">
        <center>
           <c:url var="addCustomer" value="/customer/register/add" ></c:url>

           <form method="POST" action="${addCustomer}" modelAttribute="customer">
               <fieldset>
                   <div>
                       <input type="text" name="firstName" path="firstName" placeholder="First Name" class="formSize"/>
                   </div><br/>
                   <div>
                       <input type="text" name="lastName" path="lastName" placeholder="Last Name"/>
                   </div><br/>
                   <div>
                       <input type="text" name="username" path="username" placeholder="username"/>
                   </div><br/>
                   <div>
                       <input type="text" name="password" path="password" placeholder="password"/>
                   </div><br/>
                   <div>
                     <input type="text" name="password2" path="password2" placeholder="confirm password"/>
                  </div><br/>
                   <div>
                      <input type="text" name="dateOfBirth" path="dateOfBirth" placeholder="Date of birth"/>
                   </div><br/>
                   <div>
                     <input type="text" name="email" path="email" placeholder="email address"/>
                   </div><br/>
                   <div>
                    <input type="text" name="contact" path="contact" placeholder="Cell phone numbers"/>
                   </div><br/>
                   <div>
                    <input type="text" name="address" path="address" placeholder="physical address"/>
                   </div><br/>

                   <input type="submit" value="Register" class="btnBid" style="float:right;"/>
               </fieldset>
           </form>
       </center>
    </div>
</div>


<%@include file="footer.jsp" %>