package main.com.myApp.controller;

import main.com.myApp.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("userModel", new UserModel());
        return "formPage";
    }
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("userModel") UserModel userModel, Model model) {
        model.addAttribute("userModelResult", userModel);
        return "resultPage";
    }

}


