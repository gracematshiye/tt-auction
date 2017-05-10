
<%@ include file="../header.jsp" %>

<div align="center" class="form-group" >
    <div id="wrapper">
        <c:url var="addCar" value="/admin/car/manage/create"></c:url>

        <form name="addCarForm" method="post" action="${addCar}" modelAttribute="car" style="margin-top:50px">
            <div>
                <label style="float:left; color:#008000;">Car Model Name</label>
               <input type="text" name="model" path="model" id="model"  value="${car.model}" required/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Car Make Name</label>
               <input type="text" name="make" path="make" id="make"  value="${car.make}" required/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Car Mileage</label>
               <input type="text" name="mileage" path="mileage" id="mileage" value="${car.mileage}" required/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Car Year</label>
               <input type="number" min=1980; max=2017; name="year" path="year" placeholder="1980-2017" id="year" value="${car.year}" onfocusout="validateEmail()" required/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000; margin-top -8px">Car Price</label>
               <input type="text" name="price" path="price" id="price" value="${car.price}" onfocusout="validatePhone()" required/>
            </div><br/>

            <div>
               <label style="float:left; color:#008000;">Car Condition</label>
               <input type="text" name="condition" path="condition" id="condition" value="${car.condition}" required/>
            </div><br/>

            <div>
                <label style="float:left; color:#008000;">Car Transmission</label>
                <input type="text" name="transmission" path="transmission" id="transmission" value="${car.transmission}" required/>
            </div><br/>

            <div>
                <label style="float:left; color:#008000;">Car Colour</label>
                <input type="text" name="colour" path="colour" id="colour" value="${car.colour}" required/>
            </div><br/>
            <div>
                <label style="float:left; color:#008000;">Car Fuel Type</label>
                <input type="text" name="fuel" path="fuel" id="fuel" value="${car.fuel}" required/>
            </div><br/>
            <div>
                <label style="float:left; color:#008000;">Car Description</label>
                <input type="text" name="description" path="description" id="description" value="${car.description}" required/>
            </div><br/>
            <div>
                <label style="float:left; color:#008000;">Car Quatity</label>
                <input type="number" min=1; max=100; placeholder='0 - 100' name="quantity" path="quantity" id="quantity" value="${car.quantity}" required/>
            </div><br/>

            <div>
                <label style="float:left; color:#008000;">Car Image</label>
                <input type="file" name="imageUrl" path="imageUrl" id="imageUrl" value="${car.imageUrl}" required/>
            </div><br/>

            <input type="submit" value="Register" id="btnBid" class="btn btn-register" />
        </form>
    </div>
</div>

<%@ include file="../footer.jsp" %>
