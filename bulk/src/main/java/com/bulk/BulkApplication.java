package com.bulk;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bulk.bean.CommonBean;

@SpringBootApplication
public class BulkApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(BulkApplication.class, args);
		
		
		/*	CommonBean bean = new CommonBean();
			
			bean.setStudentName(null);
			System.out.println(bean.getStudentName());
			
			System.out.println(bean.getStudentName());*/
			

	        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	        Validator validator = factory.getValidator();

	        CommonBean myObject = new CommonBean();
	        myObject.setStudentName(null);
	        myObject.setLocation(0);
	       
	        // Validate the object and collect validation errors
	        Set<ConstraintViolation<CommonBean>> violations = validator.validate(myObject);

	        for (ConstraintViolation<CommonBean> violation : violations) {
	            System.out.println(violation.getPropertyPath() + ": " + violation.getMessage());
	        }

	        factory.close();
	
	        
	        
	        
	     // Validate the object and collect validation errors
//			Set<ConstraintViolation<CommonBean>> violations = validator.validate(myObject);
//
//			if (violations != null) {
//
//				System.out.println(myObject.getStudentName());
//				System.out.println(myObject.getLocation());
//			} else {
//				for (ConstraintViolation<CommonBean> violation : violations) {
//					System.out.println(violation.getPropertyPath() + ": " + violation.getMessage());
//
//				}
//			}
//			factory.close();

	}

}
