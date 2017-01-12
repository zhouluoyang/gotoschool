package com.ggs.dao.bookinfo;

import com.ggs.domain.Bookinfo;
import com.ggs.domain.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface BookinfoRepository extends JpaRepository<Bookinfo,Integer> {

}
