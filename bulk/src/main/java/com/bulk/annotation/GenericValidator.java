package com.bulk.annotation;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenericValidator implements ConstraintValidator<Validation, Object> {
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        // Check if the value is not null
        return value != null;
    }
}



//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//import com.bulk.bean.CommonBean;
//
//public class AnnotationValidation implements ConstraintValidator<Validation, String> {
//
//	@Override
//	public boolean isValid(String value, ConstraintValidatorContext context) {
//		if (value != null) {
//			return true;
//		}
//		return false;
//	}
//
//}
