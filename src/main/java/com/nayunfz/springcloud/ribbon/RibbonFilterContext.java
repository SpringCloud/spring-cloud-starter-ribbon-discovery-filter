package com.nayunfz.springcloud.ribbon;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Copyright (c) 2012 - 2018 by xxx Ltd.
 *
 * @author <a href="crazystone_sf@126.com">zhuo.shi</a>
 * @version 1.0
 */
public class RibbonFilterContext {

    private static final ThreadLocal<Map<String, String>> tl = new InheritableThreadLocal<Map<String, String>>() {
        @Override
        protected Map<String, String> initialValue() {
            return new ConcurrentHashMap<String, String>();
        }
    };

    public static Map<String, String> getCurrentContext() {
        return tl.get();
    }

    public static void clearCurrentContext() {
        tl.remove();
    }
}
