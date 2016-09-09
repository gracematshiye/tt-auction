function validateEmail(){

    var email = $("#email").val();

    var pattern = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;

    if(!pattern.test(email)){

      $("#emlErr").html("Incorrect email format");

     } else {

      $("#emlErr").hide();
    }
}

function validatePhone(){

    var contact = $("#contact").val();

    var pattern = /^((\+[1-9]{1,4}[ \-]*)|(\([0-9]{2,3}\)[ \-]*)|([0-9]{2,4})[ \-]*)*?[0-9]{3,4}?[ \-]*[0-9]{3,4}?$/;

    if(!pattern.test(contact) ){

      $("#cntErr").html("Incorrect cell phone number");

     } else {
      $("#cntErr").hide();

     }
}

function validatePassword() {

    var password = $("#password").val();
    var password2 = $("#password2").val();

    if (password2 != password){
        $("#passErr").html("Passwords do not match!");

        } else {
            $("#passErr").hide();

       }
}
