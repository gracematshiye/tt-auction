 <c:url var="search" value="/cars/search"></c:url>

<form method="POST" action="${search}" modelAttribute="search" style="margin-top:50px">
    <input type="text" name="make" path="make" placeholder="First Name" class="formSize" value="${customer.firstName}"/>
</form>