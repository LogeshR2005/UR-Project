package com.webbackend.Backend.service;


import com.webbackend.Backend.model.User;
import com.webbackend.Backend.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    @Autowired
    private UserRepo repo;


    public User addData(User user){
        user.setUserId(UUID.randomUUID().toString().split("-")[0]);
        return repo.save(user);
    }

    public List<User> findAllUsers(){
        return repo.findAll();
    }




    public User getUserByUserID(String id){
        return repo.findById(id).get();
    }


    public User updateUser(User UpdateRequest){

        User user =  repo.findById(UpdateRequest.getUserId()).get();
        user.setUserName(UpdateRequest.getUserId());
        user.setInstagramID(UpdateRequest.getInstagramID());
        user.setPhone_number(UpdateRequest.getPhone_number());
        return repo.save(user);
    }

    public String deleteUser(String userID){
        repo.deleteById(userID);
        return "Deleted";
    }


}
