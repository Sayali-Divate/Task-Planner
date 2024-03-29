package com.taskplanner.demo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class UserDTO {	
	
	@Pattern(regexp = "^[A-Za-z]*$", message = "Enter valid name ")
	private String name;
	
	@Email
	private String email;
	
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*])[A-Za-z\\d!@#$%^&*]{8,20}$",
			message = "Please enter a password that conatins at least one upper case, one lower case, one symbol and a digit. Password should be 8 to 20 characters long")
	private String password;
}
