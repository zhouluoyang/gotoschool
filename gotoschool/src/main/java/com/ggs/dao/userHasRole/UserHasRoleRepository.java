package com.ggs.dao.userHasRole;

import com.ggs.domain.PublicAd;
import com.ggs.domain.UserHasRole;
import com.ggs.domain.UserHasRolePK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface UserHasRoleRepository extends JpaRepository<UserHasRole,UserHasRolePK> {

}
