package com.nayunfz.springcloud.ribbon.predicate;

import com.nayunfz.springcloud.ribbon.RibbonFilterContext;
import com.netflix.niws.loadbalancer.DiscoveryEnabledServer;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * Copyright (c) 2012 - 2018 by xxx Ltd.
 *
 * @author <a href="crazystone_sf@126.com">zhuo.shi</a>
 * @version 1.0
 */
public class MetadataAwarePredicate extends DiscoveryEnabledPredicate {

    @Override
    public boolean apply(DiscoveryEnabledServer server) {
        final Map<String, String> context = RibbonFilterContext.getCurrentContext();
        final Set<Map.Entry<String, String>> attributes = Collections.unmodifiableSet(context.entrySet());
        final Map<String, String> metadata = server.getInstanceInfo().getMetadata();
        return metadata.entrySet().containsAll(attributes);
    }
}
