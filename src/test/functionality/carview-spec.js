describe('Car view navigation', function() {
  it('should navigate to car view, and select an image to view', function() {
  	browser.ignoreSynchronization = true;

  	//browser.get('http://localhost:8080/cars');
  	browser.get('https://tt-auction.herokuapp.com');

    //Click on a Car
    var el =  element(by.css('.car'));
    expect(el.isDisplayed()).toBe(true);
    el.click();
    //expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/cars/1");
    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/cars/1");


    //Click on a thumbnail
    var thumb =  element.all(by.css('.imgPreview')).get(1);//select second thumbnail
    expect(thumb.isDisplayed()).toBe(true);
    thumb.click();

    var displayedPic = element(by.id('selectedCar'));
    expect(displayedPic.src == thumb.src);//double check the syntax
    //.getAttribute('src')

  });
});