package com.nayunfz.springcloud.ribbon.rule;

import com.nayunfz.springcloud.ribbon.predicate.MetadataAwarePredicate;
import com.netflix.loadbalancer.AbstractServerPredicate;
import com.netflix.loadbalancer.ZoneAvoidanceRule;

/**
 * Copyright (c) 2012 - 2018 by xxx Ltd.
 *
 * @author <a href="crazystone_sf@126.com">zhuo.shi</a>
 * @version 1.0
 */
public class MetadataAwareZoneAvoidanceRule extends ZoneAvoidanceRule {

    @Override
    public AbstractServerPredicate getPredicate() {
        return new MetadataAwarePredicate();
    }
}
