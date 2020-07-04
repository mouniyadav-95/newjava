package com.example.repository;


import com.example.model.UserMod;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends MongoRepository<UserMod, String> {

    public List<UserMod> findAll();
    public List<UserMod> findByName(String Name);
    public List<UserMod> findByEmailAndPassword(String Email,String Password);
    public List<UserMod> findByEmailIgnoreCase(String Email);
}
