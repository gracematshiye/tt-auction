//describe('Register page', function() {
//  it('should display register page', function() {
//  	browser.ignoreSynchronization = true;
//
//
//    //browser.get('http://localhost:8080/customer/register');
//    browser.get('https://tt-auction.herokuapp.com/customer/register');
//
//
//    //Add the current timestamp to the values
//    var randVal = Date.now();
//
//    element(by.css('#firstName')).sendKeys('hlulani' +randVal);
//    element(by.css('#lastName')).sendKeys('chauke' +randVal);
//    element(by.css('#username')).sendKeys('hchauke' +randVal);
//    element(by.css('#password')).sendKeys('1234' +randVal);
//    element(by.css('#password2')).sendKeys('1234' +randVal);
//    element(by.css('#dateOfBirth')).sendKeys('29/12/2016' +randVal);
//    element(by.css('#email')).sendKeys('tt.auction@mail.co.za' +randVal);
//    element(by.css('#contact')).sendKeys('0786683662' +randVal);
//    element(by.css('#address')).sendKeys('my address' +randVal);
//
//    var register =  element(by.css('.btnBid'));
//        expect(register.isDisplayed()).toBe(true);
//        register.click();
//
//        //expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/customer/register/add");
//        expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/customer/register/add");
//
//        });
//});