describe('Homepage message', function() {
  it('should return message', function() {
  	browser.ignoreSynchronization = true;

    browser.get('http://localhost:8080/car/all-cars');

    element(by.tagName('h1')).getAttribute('value').then(function(text) {
        console.log(text);
    });

    var myElement = element(by.css('.new'));
    expect(myElement.isPresent()).toBeFalsy();
  });
});