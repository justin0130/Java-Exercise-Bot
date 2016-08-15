package com.zzy.utils;

import org.sikuli.script.Screen;

/**
 * Created by justin on 24/3/16.
 */
public class Driver {
    private static Screen driver;

    public synchronized static Screen getInstance() {
        if(driver == null) {
            driver = new Screen();
        }
        return driver;
    }
}
