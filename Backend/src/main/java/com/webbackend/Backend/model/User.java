package com.webbackend.Backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")


public class User {

    @Id
    private String userId;
    private String userName;
    private String instagramID;
    private Long phone_number;

    public User(){




    }

    public User(String userId, String userName, String instagramID, Long phone_number) {
        this.userId = userId;
        this.userName = userName;
        this.instagramID = instagramID;
        this.phone_number = phone_number;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setInstagramID(String instagramID) {
        this.instagramID = instagramID;
    }

    public void setPhone_number(Long phone_number) {
        this.phone_number = phone_number;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getInstagramID() {
        return instagramID;
    }

    public Long getPhone_number() {
        return phone_number;
    }
}



