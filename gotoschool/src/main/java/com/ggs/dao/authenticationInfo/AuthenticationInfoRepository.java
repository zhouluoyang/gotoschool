package com.ggs.dao.authenticationInfo;

import com.ggs.domain.AuthenticationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface AuthenticationInfoRepository extends JpaRepository<AuthenticationInfo,Integer> {

}
