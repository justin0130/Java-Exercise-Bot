package com.zzy.automation;

import com.zzy.utils.DataProperties;
import com.zzy.utils.Driver;
import org.sikuli.script.Screen;

/**
 * Created by justin on 25/3/16.
 */
public class AbstractScreen {
    protected final static double WIN_TIMEOUT = Double.parseDouble(DataProperties.get("window.timeout"));
    protected final static double CTL_TIMEOUT = Double.parseDouble(DataProperties.get("control.timeout"));

    protected Screen getDriver() {
        return Driver.getInstance();
    }
}
