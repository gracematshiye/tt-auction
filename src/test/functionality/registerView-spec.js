//describe('Register page', function() {
//  it('should display register page', function() {
//  	browser.ignoreSynchronization = true;
////
////  	browser.get('http://localhost:8080');
//  	browser.get('https://tt-auction.herokuapp.com');
//
//    //Click on a Car
//    var el =  element(by.css('.car'));
//    expect(el.isDisplayed()).toBe(true);
//    el.click();
////    expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/cars/1");
//    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/cars/1");
//
//    //Click bid button
//    var bidButton = element(by.css('#btnBid'));
//    expect(bidButton.isDisplayed()).toBe(true);
//    bidButton.click();
////    expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/customer/register/carId=1");
//    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/customer/register/carId=1");
//
//    /* Test Validation */
//    // Password Validation
//    element(by.id('firstName')).sendKeys('first');
//    element(by.id('lastName')).sendKeys('lastUser');
//    element(by.id('username')).sendKeys('firstUser');
//    element(by.id('password')).sendKeys('user12');
//    element(by.id('password2')).sendKeys('user1');
//    element(by.id('dateOfBirth')).sendKeys('10 May 1991');
//    element(by.id('email')).sendKeys('gracem@ymail.com');
//    element(by.id('contact')).sendKeys('0783456789');
//    element(by.id('address')).sendKeys('22 Melle Street');
//
//    var passwordError = element(by.id('passErr'));
//    expect(passwordError.getText()).toEqual('Passwords do not match!');
//    expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/customer/register/carId=1");
//    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/customer/register/carId=1");
//
//    // Email Validation
//    element(by.id('firstName')).sendKeys('first');
//    element(by.id('address')).sendKeys('22 Melle Street');
//
//    var passwordError = element(by.id('passErr'));
//    expect(passwordError.getText()).toEqual('Passwords do not match!');
//    expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/customer/register/carId=1");
//    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/customer/register/carId=1");
//
// // Email Validation
//    element(by.id('firstName')).sendKeys('first');
//    element(by.id('lastName')).sendKeys('lastUser');
//    element(by.id('username')).sendKeys('firstUser');
//    element(by.id('password')).sendKeys('user1');
//    element(by.id('password2')).sendKeys('user1');
//    element(by.id('dateOfBirth')).sendKeys('10 May 1991');
//    element(by.id('email')).sendKeys('gracem4ymail.com');
//    element(by.id('contact')).sendKeys('0783456789');
//    element(by.id('address')).sendKeys('22 Melle Street');
//
//     var emailError = element(by.id('emlErr'));
//     expect(emailError.getText()).toEqual("Incorrect email format");
//    expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/customer/register/carId=1");
//    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/customer/register/carId=1");
//
// // Cellphone number Validation
//    element(by.id('firstName')).sendKeys('first');
//    element(by.id('lastName')).sendKeys('lastUser');
//    element(by.id('username')).sendKeys('firstUser');
//    element(by.id('password')).sendKeys('user1');
//    element(by.id('password2')).sendKeys('user1');
//    element(by.id('dateOfBirth')).sendKeys('10 May 1991');
//    element(by.id('email')).sendKeys('gracem@ymail.com');
//    element(by.id('contact')).sendKeys('07345789');
//    element(by.id('address')).sendKeys('22 Melle Street');
//
//    element(by.css('.btnBid')).click();
//    var contactError = element(by.id('cntErr'));
//    expect(contactError.getText()).toEqual("Incorrect cell phone number");
//    expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/customer/register/carId=1");
//    expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/customer/register/carId=1");
//
////    //Fill in all the text box
//    element(by.css('#firstName')).sendKeys('first');
//    element(by.css('#lastName')).sendKeys('lastUser');
//    element(by.css('#username')).sendKeys('firstUser');
//    element(by.css('#password')).sendKeys('user1');
//    element(by.css('#password2')).sendKeys('user1');
//    element(by.css('#dateOfBirth')).sendKeys('10 May 1991');
//    element(by.css('#email')).sendKeys('gracem@ymail.com');
//    element(by.css('#contact')).sendKeys('0783456789');
//    element(by.css('#address')).sendKeys('22 Melle Street');
//
//
//     var register =  element(by.css('#btnBid'));
//     expect(register.isDisplayed()).toBe(true);
//     register.click();
//
////     expect(browser.getCurrentUrl()).toEqual("http://localhost:8080/customer/register/add/carId=1");
//     expect(browser.getCurrentUrl()).toEqual("https://tt-auction.herokuapp.com/customer/register/add/carId=1");
//
//    });
//});
//
