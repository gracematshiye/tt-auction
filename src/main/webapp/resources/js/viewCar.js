function selectCar(content) {
    //Deselect the current selected thumb
    var currentSelected = document.getElementsByClassName("selected");
    //currentSelected.classList.remove("selected");
    currentSelected[0].classList.toggle("selected");

    content.classList.toggle("selected");
    var container = document.getElementById("selectedCar");
    container.src = content.src;
}

function bidNow(){
}

//Notes:
//Change button to bid now after validating the offer amount, dynamic call to validateOffer.js

//Click [Bid this Car]
//Show pop up: Your Offer: [55,000.00]
//Change btnBid text to [Bid Now]
//Click [Bid Now] to place bid