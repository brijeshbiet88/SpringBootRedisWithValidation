package com.redis.model;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Max(value=999999, message="Id must be less than 1000000")  
	private Long id;
    
	@NotBlank
    @Size(min=2, max=20)
	private String firstName;
    
	@NotBlank
    @Size(min=2, max=20)
    private String lastName;
    
	@Email
    private String emailId;
    
    @Pattern(regexp="[0-9]{10}",message="length must be 10 and All Numeric Values") 
    private String mobile;
    
    private int age;
}