package com.example.controller;


import com.example.model.UserMod;
import com.example.service.UserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import java.util.List;

@RestController
public class UserController {


    @Autowired
    private UserServ userSer;

    @RequestMapping("/create")
    public String create(@RequestParam String name , @RequestParam String email, @RequestParam String role, @RequestParam String department , @RequestParam String password )
    {
        return userSer.create(name,email,role,department,password);
    }

    @RequestMapping("/get")
    public List<UserMod> findByName(@RequestParam String name)
    {
        List<UserMod> all = userSer.findByName(name);

        return all;
    }

    @RequestMapping("/getAll")
    public List<UserMod> findAll()
    {
        return userSer.findAll();
    }

    @RequestMapping("/getEmailPassword")
    public List<UserMod> findUser(@RequestParam String email , @RequestParam String password){

        return userSer.findByEmailPassword(email,password);

    }

    @RequestMapping("/getEmail")
    public List<UserMod> findPerson(@RequestParam String email){

        return userSer.findByEmail(email);

    }

}
