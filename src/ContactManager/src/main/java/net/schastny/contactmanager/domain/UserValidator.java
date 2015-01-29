package net.schastny.contactmanager.domain;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
 
public class UserValidator implements Validator {
 
	@Override
	public boolean supports(Class<?> clazz) {
		return Contact.class.isAssignableFrom(clazz);
	}
 
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "FIRSTNAME", "name.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "LASTNAME", "password.required");
		ValidationUtils.rejectIfEmpty(errors, "EMAIL", "gender.required");
	}
 
}