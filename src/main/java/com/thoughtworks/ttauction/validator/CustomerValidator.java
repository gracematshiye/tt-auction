package com.thoughtworks.ttauction.validator;

import com.thoughtworks.ttauction.entity.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CustomerValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Customer.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "valid.password");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password2", "valid.password2");

        Customer customer = (Customer) object;

        if (!customer.getPassword().equals(customer.getPassword2())) {
            errors.rejectValue("passwordConf", "valid.invalidPassword");
        }
    }
}
