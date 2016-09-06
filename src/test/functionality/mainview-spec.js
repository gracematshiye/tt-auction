describe('Homepage images', function() {
  it('should display images', function() {
  	browser.ignoreSynchronization = true;

    //browser.get('http://localhost:8080/cars');
    browser.get('https://tt-auction.herokuapp.com');

    //Click Home tab
    var home =  element(by.css('.home'));
    expect(home.isDisplayed()).toBe(true);
    home.click();
    //expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/cars");
    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com");

    //Click logo
    var logo =  element(by.css('.logo'));
    expect(logo.isDisplayed()).toBe(true);
    logo.click();
    //expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/cars");
    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com");

    //Click on a Car
    var el =  element(by.css('.car'));
    expect(el.isDisplayed()).toBe(true);
    el.click();
    //expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/cars/1");
    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/cars/1");

//
//
//
  });
});