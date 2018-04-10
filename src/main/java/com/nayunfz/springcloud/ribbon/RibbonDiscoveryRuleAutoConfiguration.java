package com.nayunfz.springcloud.ribbon;

import com.nayunfz.springcloud.ribbon.rule.DiscoveryEnabledRule;
import com.nayunfz.springcloud.ribbon.rule.MetadataAwareRule;
import com.netflix.niws.loadbalancer.DiscoveryEnabledNIWSServerList;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Copyright (c) 2012 - 2018 by xxx Ltd.
 *
 * @author <a href="crazystone_sf@126.com">zhuo.shi</a>
 * @version 1.0
 */
@Configuration
@ConditionalOnClass(DiscoveryEnabledNIWSServerList.class)
@AutoConfigureBefore(RibbonClientConfiguration.class)
@ConditionalOnProperty(
        value = "ribbon.filter.metadata.enabled",
        matchIfMissing = true
)
public class RibbonDiscoveryRuleAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    DiscoveryEnabledRule metadataEnabledRule(){
        return new MetadataAwareRule();
    }

}
