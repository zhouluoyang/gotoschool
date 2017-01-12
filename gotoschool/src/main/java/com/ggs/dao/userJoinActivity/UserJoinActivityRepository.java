package com.ggs.dao.userJoinActivity;

import com.ggs.domain.PublicAd;
import com.ggs.domain.UserJoinActivity;
import com.ggs.domain.UserJoinActivityPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface UserJoinActivityRepository extends JpaRepository<UserJoinActivity,UserJoinActivityPK> {

}
