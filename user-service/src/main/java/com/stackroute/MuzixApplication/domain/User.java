package com.stackroute.MuzixApplication.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;


//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;

@Document(collection = "User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    //@GeneratedValue
   private int userId;
    @ApiModelProperty(notes="name of track")
    private String userName;
    @ApiModelProperty(notes = "comments on track")
   private String comments;


//    public User(String trackName, String comments) {
//        this.trackName = trackName;
//        this.comments = comments;
//    }
}
