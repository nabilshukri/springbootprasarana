package com.prasarana.springbootprasarana;

import com.prasarana.springbootprasarana.model.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @Autowired
    private MyUserRepository myUserRepository;

    @GetMapping("/home")
    public String handleHome() {
        return "home";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "home_admin";
    }

    @GetMapping("/user/home")
    public String handleUserHome(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        model.addAttribute("username", username);
        return "home_user";
    }

    @GetMapping("/login")
    public String handleLogin(Model model, @RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            model.addAttribute("error", "Invalid username or password.");
        }
        return "login";
    }

    @GetMapping("/register")
    public String handleRegister() {
        return "register";
    }


}


