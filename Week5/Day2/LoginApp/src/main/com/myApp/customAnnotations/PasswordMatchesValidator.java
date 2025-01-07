package main.com.myApp.customAnnotations;

import main.com.myApp.model.EmployeeModel;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, EmployeeModel> {
    @Override
    public boolean isValid(EmployeeModel employeeModel, ConstraintValidatorContext constraintValidatorContext) {

      // check Passwords Matching
      return employeeModel.getPassword().equals(employeeModel.getConfirmPass());
    }
}
