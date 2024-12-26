package main.com.myApp.controller;


import main.com.myApp.model.EmployeeModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String showHomePage(Model model){
        model.addAttribute("empModel",new EmployeeModel());
        return "homePage";
    }
    @RequestMapping("/registerForm")
    public String submitForm(@ModelAttribute("empModel") EmployeeModel employeeModel, Model model){
        model.addAttribute("empModelResult",employeeModel);
        return "resultPage";
    }

}
