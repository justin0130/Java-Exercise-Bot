package com.zzy.automation;

import com.zzy.utils.DataProperties;
import org.sikuli.script.Pattern;

/**
 * Created by justin on 25/3/16.
 */
public class MainScreen extends AbstractScreen {
    private Pattern home;

    public MainScreen() {
        home = new Pattern(DataProperties.get("home.png"));
    }

    public void clickHome() {}
}
