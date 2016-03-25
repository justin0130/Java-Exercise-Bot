package com.zzy;

import com.zzy.utils.DataProperties;
import com.zzy.utils.HttpRequest;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

/**
 * Created by justin on 22/3/16.
 */
public class main {

    public static void main(String[] args) throws FindFailed {
        Screen screen = new Screen();
        screen.find(DataProperties.path("home.png"));
        screen.click(DataProperties.path("home.png"));

        System.out.println(DataProperties.get("window.timeout"));
    }
}
