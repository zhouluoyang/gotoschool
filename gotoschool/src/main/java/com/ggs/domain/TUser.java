package com.ggs.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Administrator on 2016-12-31.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_user", schema = "", catalog = "gotoschool")
public class TUser {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "userid")
    private int userid;
    private String name;
    private String username;
    private String nickname;
    private String password;
    private Time createtime;
    private String email;
    private String phone;
}
