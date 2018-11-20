/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.d4d.facebook.demo.service.impl;

import com.d4d.facebook.demo.service.FacebookService;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kirellos
 */
@Service
public class FacebookServiceImpl implements FacebookService {

    // to get facebook user info with accessToken 
    @Override
    public String getUserData(String token) {
        Facebook facebook = new FacebookTemplate(token);
        String[] fields = {"id", "first_name","name", "email", 
            "birthday", "gender", "age_range",
            "hometown", "inspirational_people","location",
            "website","likes"};
        
        return facebook.fetchObject("me", String.class, fields);
    }
}
