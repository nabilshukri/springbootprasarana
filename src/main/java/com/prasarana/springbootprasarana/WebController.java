package com.prasarana.springbootprasarana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/home")
    public String handleHome() {
        return "home";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome() {
        return "home_admin";
    }

    @GetMapping("/user/home")
    public String handleUserHome() {
        return "home_user";
    }

    @GetMapping("/login")
    public String handleLogin() {
        return "login";
    }
}
