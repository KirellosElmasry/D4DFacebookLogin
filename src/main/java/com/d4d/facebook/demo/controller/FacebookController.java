/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d4d.facebook.demo.controller;

import com.d4d.facebook.demo.service.FacebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Kirellos
 */
@RestController
@RequestMapping("/facebook")
public class FacebookController {
    
    @Autowired
    private FacebookService facebookService;
    
    @GetMapping
    public String welcome(){
        return "welcome";
    }
    
    @PostMapping("/getUserData")
    public String getUserData(@RequestBody String token){
      
       return facebookService.getUserData(token);
    }
}
