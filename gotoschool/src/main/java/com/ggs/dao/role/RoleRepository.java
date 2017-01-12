package com.ggs.dao.role;

import com.ggs.domain.Role;
import com.ggs.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface RoleRepository extends JpaRepository<Role,Integer> {

}
