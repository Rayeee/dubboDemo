package me.zgy.core.context;

import com.dianping.cat.Cat;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by Rayee on 2017/10/12.
 */
public class CatContext implements Cat.Context{

    private Map<String, String> properties = Maps.newHashMap();

    @Override
    public void addProperty(String key, String value) {
        properties.put(key, value);
    }

    @Override
    public String getProperty(String key) {
        return properties.get(key);
    }
}
