package com.nayunfz.springcloud.ribbon.rule;

import com.nayunfz.springcloud.ribbon.predicate.DiscoveryEnabledPredicate;
import com.nayunfz.springcloud.ribbon.predicate.MetadataAwarePredicate;

/**
 * Copyright (c) 2012 - 2018 by xxx Ltd.
 *
 * @author <a href="crazystone_sf@126.com">zhuo.shi</a>
 * @version 1.0
 */
public class MetadataAwareRule extends DiscoveryEnabledRule {


    public MetadataAwareRule(){
        this(new MetadataAwarePredicate());
    }

    public MetadataAwareRule(DiscoveryEnabledPredicate predicate) {
        super(predicate);
    }
}
