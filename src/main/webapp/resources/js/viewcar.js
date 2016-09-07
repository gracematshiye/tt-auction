function selectCar(content) {
    //Deselect the current selected thumb
    var currentSelected = document.getElementsByClassName("selected");
    //currentSelected.classList.remove("selected");
    currentSelected[0].classList.toggle("selected");

    content.classList.toggle("selected");
    var container = document.getElementById("selectedCar");
    container.src = content.src;
}

//selectedThumb variable, assign a selected thumb to this, and add some styling to make it an active selected thumb