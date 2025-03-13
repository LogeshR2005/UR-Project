package com.webbackend.Backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.webbackend.Backend.model.User;

public interface UserRepo  extends MongoRepository<User,String> {




}
