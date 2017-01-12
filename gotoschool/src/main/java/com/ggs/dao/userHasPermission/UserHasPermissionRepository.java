package com.ggs.dao.userHasPermission;

import com.ggs.domain.PublicAd;
import com.ggs.domain.UserHasPermission;
import com.ggs.domain.UserHasPermissionPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface UserHasPermissionRepository extends JpaRepository<UserHasPermission,UserHasPermissionPK> {

}
