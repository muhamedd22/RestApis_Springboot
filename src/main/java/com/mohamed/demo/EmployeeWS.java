package com.mohamed.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeWS {

    @GetMapping("/")
    public String welcome(){
        return "Welcome Employees";
    }
}
