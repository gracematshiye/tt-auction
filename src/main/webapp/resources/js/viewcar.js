function selectCar(content) {
    content.classList.toggle("active");
    var container = document.getElementById("selectedCar");
    container.src = content.src;
    //content.style["opacity"] = 1;
    content.style["box-shadow"] = "0 1px 5px rgba(0,0,0,.5)";
}

//selectedThumb variable, assign a selected thumb to this, and add some styling to make it an active selected thumb