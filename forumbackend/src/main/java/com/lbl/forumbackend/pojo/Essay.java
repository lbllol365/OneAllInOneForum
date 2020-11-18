package com.lbl.forumbackend.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Essay {
    @Id
    private Integer id;
    private String content;
    private Date send_date;
    private String send_user_nickname;
    private Integer top_count;
}
