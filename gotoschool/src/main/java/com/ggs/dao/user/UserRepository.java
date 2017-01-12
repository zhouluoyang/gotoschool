package com.ggs.dao.user;

import com.ggs.domain.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface UserRepository extends JpaRepository<TUser,Integer> {

}
