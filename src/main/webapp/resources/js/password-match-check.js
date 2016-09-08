function checkPasswordMatch() {

    var password = $("#password").val();
    var password2 = $("#password2").val();

    if (password != password2){
        $("#passErr").html("Passwords do not match!");

        } else {
            $("#passErr").hide();

        }
}