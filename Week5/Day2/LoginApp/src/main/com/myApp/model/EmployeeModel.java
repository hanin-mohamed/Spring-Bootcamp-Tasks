package main.com.myApp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Component
@Setter
@Getter
public class EmployeeModel {
    @NotBlank(message = "Username is required")
    private  String name;

    @NotEmpty(message = "Email is required")
    @Email(message = "Invalid Email")
    private String email;



    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;

    @NotEmpty(message = "Confirm Password is required")
    private String confirmPass;
}
