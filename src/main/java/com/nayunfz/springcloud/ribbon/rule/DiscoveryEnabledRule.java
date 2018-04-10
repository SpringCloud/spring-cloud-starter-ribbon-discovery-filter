package com.nayunfz.springcloud.ribbon.rule;

import com.nayunfz.springcloud.ribbon.predicate.DiscoveryEnabledPredicate;
import com.netflix.loadbalancer.AbstractServerPredicate;
import com.netflix.loadbalancer.AvailabilityPredicate;
import com.netflix.loadbalancer.CompositePredicate;
import com.netflix.loadbalancer.PredicateBasedRule;

/**
 * Copyright (c) 2012 - 2018 by xxx Ltd.
 *
 * @author <a href="crazystone_sf@126.com">zhuo.shi</a>
 * @version 1.0
 */
public abstract class DiscoveryEnabledRule extends PredicateBasedRule {

    private final CompositePredicate predicate;

    public DiscoveryEnabledRule(DiscoveryEnabledPredicate discoveryEnabledPredicate) {
        this.predicate = CompositePredicate.withPredicates(discoveryEnabledPredicate, new AvailabilityPredicate(this, null)).build();
    }

    @Override
    public AbstractServerPredicate getPredicate() {
        return predicate;
    }
}
