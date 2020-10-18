package com.example.test.tests;

import com.example.test.framework.AppManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected static AppManager app = new AppManager(System.getProperty("browser",BrowserType.CHROME));

    @BeforeClass
    public void setUp(){
        app.start();

    }

    @AfterClass (enabled = false)
    public void TearDown(){
        app.stop();
    }

}
