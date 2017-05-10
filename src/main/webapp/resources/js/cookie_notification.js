$(function () {
    var cookie = document.cookie;

    if (cookie.indexOf("EULawNotification") != -1) {
        displayNotificationToNone();
    }
});

function hideNotification() {
    setCookieExpireDate();
}

function setCookieExpireDate(months) {
    months = months || -1;
    var now = new Date();
    now.setMonth(now.getMonth() + months);
    document.cookie = 'EULawNotification=EULawNotification; expires=' + now.toUTCString() + '; path=/';
}

function displayNotificationToNone() {
    $("#about_notification").css("display", "none");
}