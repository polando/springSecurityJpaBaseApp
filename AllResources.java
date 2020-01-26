package com.milq.springSecurityJpaBaseApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllResources {

    @GetMapping("/")
    public String index(){
        return "this is index page";
    }

    @GetMapping("/user")
    public String user(){
        return "this is user page";
    }

    @GetMapping("/admin")
    public String admin(){
        return "this is admin page";
    }
}
