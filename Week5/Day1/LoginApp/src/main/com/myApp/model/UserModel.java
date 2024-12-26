package main.com.myApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private String username;
    private String password;
    private String country;
    private String programmingLanguage;
    private String os;
}
