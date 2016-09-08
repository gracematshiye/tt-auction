function validateForm(){


    var errorMessage = "";
    var isDoneValidating = false;
    var firstName = document.forms["registerForm"]["firstName"].value;
    var lastName = document.forms["registerForm"]["lastName"].value;
    var username = document.forms["registerForm"]["username"].value;
    var password = document.forms["registerForm"]["password"].value;
    var password2 = document.forms["registerForm"]["password2"].value;
    var dateOfBirth = document.forms["registerForm"]["dateOfBirth"].value;
    var email = document.forms["registerForm"]["email"].value;
    var contact = document.forms["registerForm"]["contact"].value;
    var address = document.forms["registerForm"]["address"].value;

    isNotNull(firstName, "firstName");
    isNotNull(lastName, "lastName");
    isNotNull(username, "username");
    isNotNull(password, "Password");
    isNotNull(password2, "Confirm password");
    isNotNull(dateOfBirth, "Date of birth");
    isNotNull(email, "email");
    isNotNull(contact, "contact");
    isNotNull(address, "address");


      function isNotNull(fieldValue, fieldName) {
         if(fieldValue == null || fieldValue == ""){
           errorMessage += fieldName + " must be filled out </br>";

           return false;
         } else if(password != password2){
            errorMessage += password + "Please confirm your password";

            return false;
         }
      }

      if(password != password2){
        password += password + "field must match </br>";
        return false;
      }

      if(!isDoneValidating){
            document.getElementById("errorMessage").innerHTML = errorMessage;
        }
}


//$(document).ready(function() {
//    $("#submit").click(function() {
//        var firstName = $("#firstName").val();
//        var lastName = $("#lastName").val();
//        var username = $("#username").val();
//        var password = $("#password").val();
//        var password2 = $("#password2").val();
//        var dateOfBirth = $("#dateOfBirth").val();
//        var email = $("#email").val();
//        var contact = $("#contact").val();
//        var address = $("#address").val();
//
//        $("#returnmessage").empty(); // To empty previous error/success message.
//            // Checking for blank fields.
//            if (firstName == '' ||  ||  || password2 == '' || dateOfBirth == '' || email == '' || contact == '' || address == '') {
//                alert("Please Fill Required Fields");
//
//            } else if(firstName == '' || firstName == null){
//                alert("Please enter your first name");
//
//            } else if(lastName == '' || lastName == null) {
//                alert("Please enter your last name");
//
//            } else if(username == '' ){
//                alert("Please enter your username");
//
//            } else if(password == ''){
//                alert("Please enter your password");
//
//            } else if(password2 == ''){
//                alert("Please enter confirm your password");
//
//            } else if(dateOfBirth == ''){
//                alert("Please enter your date of birth");
//
//            } else if(email == ''){
//                alert("Please enter your email address");
//
//            } else if(contact == ''){
//                alert("Please enter your contact number");
//
//            } else if(address == ''){
//                alert("Please enter your physical address");
//
//            } else if(!isValidEmailAddress(email)){
//                alert("Please enter a valid email address");
//
//            } else if (!isValidCellNumber(contact)){
//                alert("Please enter a valid contact number");
//
//            } else if(!(password).match(password2)) {
//                alert("Your passwords don't match. Try again?");
//
//            }  else {
//            // Returns successful data submission message when the entered information is stored in database.
//                $.post("http://localhost:8080/customer/register/add", {
//                firstName: firstName,
//                lastName: lastName,
//                password: password,
//                password2: password2,
//                dateOfBirth: dateOfBirth,
//                email: email,
//                contact, contact,
//                address, address
//
//            }, function(data) {
//                $("#returnmessage").append(data); // Append returned message to message paragraph.
//                    if (data == "You have Successfully Registered.....'.") {
//
//                    $("#form")[0].reset(); // To reset form fields on success.
//                }
//            });
//        }
//    });
//});
//
//function isValidEmailAddress(email) {
//    var pattern = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
//    return pattern.test(email);
//}
//
//function isValidCellNumber(contact){
//    var pattern = /\(?([0-9]{3})\)?([ .-]?)([0-9]{3})\2([0-9]{4})/;
//    return pattern.test(contact);
//}