function validateOffer() {
    var validate = document.getElementById('uname').value;
    if(!validate.match(/\S/))
    {
        alert ('Please enter your offer amount.');
        return false;
    }
    else
    {
        return true;
    }
}