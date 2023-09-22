package com.bulk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
@Constraint(validatedBy=GenericValidator.class)
public @interface Validation {
	
		String message() default "Invalid value";
	    Class<?>[] groups() default {}; // Add the groups parameter
	    Class<? extends Payload>[] payload() default {};
}