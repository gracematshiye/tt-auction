describe('Homepage message', function() {
  it('should return message', function() {
  	browser.ignoreSynchronization = true;

    browser.get('http://localhost:8080/car/all-cars');

    element(by.tagName('li')).getAttribute('value').then(function(text) {
        console.log(text);
    });
//
//    var clickCarImg = element(by.css('.car'));
//    clickCarImg.click().expect();
//
    var myElement = element(by.css('.car'));
    expect(myElement.isPresent()).toBeFalsy();
  });
});