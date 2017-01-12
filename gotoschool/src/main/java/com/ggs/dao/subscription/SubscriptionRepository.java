package com.ggs.dao.subscription;

import com.ggs.domain.PublicAd;
import com.ggs.domain.Subscription;
import com.ggs.domain.SubscriptionPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2016-12-25.
 */
public interface SubscriptionRepository extends JpaRepository<Subscription,SubscriptionPK> {

}
