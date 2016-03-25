package com.zzy.utils;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * Created by justin on 25/3/16.
 */
public class DataProperties {
    private static Properties PROPERTIES;

    static {
        PROPERTIES = new Properties();
        URL props = ClassLoader.getSystemResource("data.properties");
        try {
            PROPERTIES.load(props.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    public static String get(String key) {
        return getProperty(key);
    }

    public static String getPathFor(String file) {
        return ClassLoader.getSystemResource(file).getPath().toString();
    }

    public static String path(String file) {
        return getPathFor(file);
    }
}
