package com.nayunfz.springcloud.ribbon.predicate;

import com.netflix.loadbalancer.AbstractServerPredicate;
import com.netflix.loadbalancer.PredicateKey;
import com.netflix.niws.loadbalancer.DiscoveryEnabledServer;

/**
 * Copyright (c) 2012 - 2018 by xxx Ltd.
 *
 * @author <a href="crazystone_sf@126.com">zhuo.shi</a>
 * @version 1.0
 */
public abstract class DiscoveryEnabledPredicate extends AbstractServerPredicate {

    public boolean apply(PredicateKey predicateKey) {
        return predicateKey != null
                && predicateKey.getServer() instanceof DiscoveryEnabledServer
                && apply((DiscoveryEnabledServer) predicateKey.getServer());
    }

    public abstract boolean apply(DiscoveryEnabledServer server);
}
