function validateForm(){
    var firstName = document.forms["registerForm"]["firstName"].value;

        if (firstName == null || firstName == "") {
            alert("first name must be filled out");
            return false;
        }
}