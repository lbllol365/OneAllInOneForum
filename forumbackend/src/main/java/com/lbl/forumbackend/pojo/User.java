package com.lbl.forumbackend.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    private Integer id;
    private String nickname;
    private String email;
    private String password;

}
