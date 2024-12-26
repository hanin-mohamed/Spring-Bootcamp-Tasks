package main.com.myApp.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class EmployeeModel {
    private  String name;
    private String email;
    private String password;
    private String confirmPass;
}
