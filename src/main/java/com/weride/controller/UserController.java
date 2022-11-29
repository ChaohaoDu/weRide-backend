package com.weride.controller;

import com.weride.model.User;
import com.weride.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This is a controller for user login and register.
 * Use postman to test login and register
 * For test method: send get request like http://localhost:8080/test
 * For login method: send get request like http://localhost:8080/login?firstName=asdasf&password=fasdsad
 * For register method: send get request like http://localhost:8080/register?firstName=asdasf&password=fasdsad
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    /**
     * test find all user
     * @return a string for test
     */
    @GetMapping("/test")
    public String test() {
        return userRepository.test().toString();
    }

    /**
     * test login
     * @param user the input user
     * @return a string to test if successfully logged in
     */
    @GetMapping("/login")
    public String login(User user) {
        System.out.println(user);
        List<User> users = userRepository.login(user);
        users.stream().forEach(x -> System.out.println(x));
        System.out.println(users.size());
        if (users.size() == 0) {
            return "Invalid Username or Password";
        }
        return "Successfully Login in";
    }

    /**
     * test register
     * @param user the input user
     * @return a string to test if successfully register
     */
    @GetMapping("/register")
    public String register(User user) {
        userRepository.register(user);
        return "Successfully Register";
    }
}
