function validateEmail(){

    var email = $("#email").val();

    var pattern = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;

    if(!pattern.test(email)){

      $("#emlErr").html("Incorrect email format");

     } else {

      $("#emlErr").hide();
      useThis();
    }
}

function validatePhone(){

    var contact = $("#contact").val();

    var pattern = /^((\+[1-9]{1,4}[ \-]*)|(\([0-9]{2,3}\)[ \-]*)|([0-9]{2,4})[ \-]*)*?[0-9]{3,4}?[ \-]*[0-9]{3,4}?$/;

    if(!pattern.test(contact) ){

      $("#cntErr").html("Incorrect cell phone number");

     } else {
      $("#cntErr").hide();
        useThis();
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

function useThis() {
    var firstName = $("#firstName").val();
    var lastName = $("#lastName").val();
    var username = $("#username").val();
    var password = $("#password").val();
    var password2 = $("#password2").val();
    var dateOfBirth = $("#dateOfBirth").val();
    var email = $("#email").val();
    var contact = $("#contact").val();
    var address = $("#address").val();
    if (!(firstName === "" || lastName === "" || username === "" || password === "" || password2 === "" || dateOfBirth === "" || email === "" || contact === "" || address === "" ))
    {
        $("#btnBid").removeAttr('disabled');
    }
}
