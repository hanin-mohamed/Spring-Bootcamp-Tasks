package main.com.myApp.controller;


import main.com.myApp.model.EmployeeModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @RequestMapping("")
    public String showHomePage(Model model){
        model.addAttribute("empModel",new EmployeeModel());
        return "homePage";
    }
    @RequestMapping("/registerForm")
    public String submitForm(@Valid @ModelAttribute("empModel") EmployeeModel employeeModel, BindingResult result, Model model){
        model.addAttribute("empModelResult",employeeModel);
        if (result.hasErrors()){
            return "homePage";
        }
        return "resultPage";
    }

}
