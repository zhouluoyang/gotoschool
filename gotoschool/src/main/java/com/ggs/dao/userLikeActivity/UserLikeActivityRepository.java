package com.ggs.dao.userLikeActivity;

import com.ggs.domain.PublicAd;
import com.ggs.domain.UserLikeActivity;
import com.ggs.domain.UserLikeActivityPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface UserLikeActivityRepository extends JpaRepository<UserLikeActivity,UserLikeActivityPK> {

}
