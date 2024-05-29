package com.prasarana.springbootprasarana;

import com.prasarana.springbootprasarana.model.MyUser;
import com.prasarana.springbootprasarana.model.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private MyUserRepository myUserRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

//    @PostMapping("/register/user")
//    public MyUser createUser(@RequestBody MyUser user){
//
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return myUserRepository.save(user);
//    }

    @PostMapping("/register/user")
    public ResponseEntity<String> createUser(@RequestBody MyUser user) {
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setRole("USER");
            myUserRepository.save(user);
            return ResponseEntity.ok("User registered successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Registration failed");
        }
    }

}
