package com.example.service;


import com.example.model.UserMod;
import com.example.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServ {

    @Autowired
    public  UserRepo uRep;

    public String create(String name, String email, String role, String department, String password){

        List<UserMod> temp = uRep.findByEmailIgnoreCase(email);
        if(temp.size()==0)
       return uRep.save(new UserMod(name,email,role,department,password)).toString();
        else
            return  "user already exists";
    }

    public List<UserMod> findAll(){

        List<UserMod> all = uRep.findAll();

        return all;
    }

    public List<UserMod> findByName(String name){

      List<UserMod> fP = uRep.findByName(name);
        return fP;

    }

    public List<UserMod> findByEmailPassword(String email, String password){

        return uRep.findByEmailAndPassword(email,password);

    }

    public List<UserMod> findByEmail(String email){

        return uRep.findByEmailIgnoreCase(email);

    }




}
