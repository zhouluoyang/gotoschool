package com.ggs.dao.activity;

import com.ggs.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface ActivityRepository extends JpaRepository<Activity,Integer> {
    
}
