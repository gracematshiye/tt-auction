<%@ include file="../header.jsp" %>

<div class="container">
    <div align="center" class="form-group" >

    <div class="list-group-item" style = "margin-top:20px; margin-bottom:-9px">
       <center><h3>Register A Car Into Auction</h3></center>
    </div>

    <c:url var="addCar" value="/admin/car/manage/create"></c:url>
    <form name="addCarForm" method="post" action="${addCar}" modelAttribute="car" style="margin-top:50px" enctype="multipart/form-data" class="list-group-item">

    <table border="0">
        <tr>
            <td>
                <div class="form-group">
                    <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Model Name</label>
                    <input type="text"  class="form-control" name="model" path="model" id="model"  value="${car.model}" required/>
                    <font color="red">${error.model}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                   <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Make Name</label>
                   <input type="text"  class="form-control" name="make" path="make" id="make"  value="${car.make}" required/>
                   <font color="red">${error.make}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                    <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Mileage</label>
                    <input type="text" class="form-control" name="mileage" path="mileage" id="mileage" value="${car.mileage}" required/>
                    <font color="red">${error.mileage}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                   <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Year</label>
                   <input type="number" min=1980; max=2017;  class="form-control" name="year" path="year" placeholder="1980-2017" id="year" value="${car.year}" onfocusout="validateEmail()" required/>
                   <font color="red">${error.year}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                   <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Price</label>
                   <input type="text"  class="form-control" name="price" path="price" id="price" value="${car.price}" onfocusout="validatePhone()" required/>
                   <font color="red">${error.price}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                   <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Condition</label>
                   <input type="text" class="form-control" name="condition" path="condition" id="condition" value="${car.condition}" required/>
                   <font color="red">${error.condition}</font>
                </div>
           </td>
       </tr>
       <tr>
           <td>
               <div class="form-group">
                  <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Transmission</label>
                   <input type="text"  class="form-control" name="transmission" path="transmission" id="transmission" value="${car.transmission}" required/>
                   <font color="red">${error.transmission}</font>
               </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                   <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Colour</label>
                   <input type="text" class="form-control" name="colour" path="colour" id="colour" value="${car.colour}" required/>
                   <font color="red">${error.colour}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                   <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Fuel Type</label>
                   <input type="text" class="form-control" name="fuel" path="fuel" id="fuel" value="${car.fuel}" required/>
                   <font color="red">${error.fuel}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                   <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Description</label>
                   <input type="text" class="form-control" name="description" path="description" id="description" value="${car.description}" required/>
                   <font color="red">${error.description}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                   <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Quatity</label>
                   <input type="number" min=1; max=100; placeholder='0 - 100' class="form-control" name="quantity" path="quantity" id="quantity" value="${car.quantity}" required/>
                   <font color="red">${error.quantity}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                   <label class="col-xs-1 control-label pull-left" style="width:200px;">Car Image</label>
                   <input type="file" class="form-control" name="file" path="imageUrl" id="imageUrl" value="${car.imageUrl}" required/>
                   <font color="red">${error.imageUrl}</font>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="form-group">
                    <input type="submit" value="Add Product" style="float:right;" id="btnBid" class="btn btn-register" />
                </div>
            </td>
        </tr>
    </table>

    </form>
    </div>
    </div>
</div>

<%@ include file="../footer.jsp" %>
