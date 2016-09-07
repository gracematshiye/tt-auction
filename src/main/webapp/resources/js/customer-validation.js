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

           if(fieldName == address){
                isDoneValidating = true;
           }
           return false;
         }

      }
      if(!isDoneValidating){
            document.getElementById("errorMessage").innerHTML = errorMessage;

        }

}