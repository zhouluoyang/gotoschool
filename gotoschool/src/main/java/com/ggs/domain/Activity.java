package com.ggs.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Administrator on 2016-12-31.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "activity", schema = "", catalog = "gotoschool")
public class Activity {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "activityid")
    private int activityid;
    private String title;
    private String content;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date begintime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endtime;
    private String address;
    private String talker;
    private int likeNm;
    private int collectNm;
    private int activXtype;
    private int activStype;
    private int activStatu;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userid", unique=false, nullable=false, updatable=false)
    private TUser tUser;
}
