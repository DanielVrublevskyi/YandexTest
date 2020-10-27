package com.example.test.tests;

import com.example.test.framework.AppManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase {

    protected static AppManager app = new AppManager(System.getProperty("browser",BrowserType.CHROME));
Logger logger = LoggerFactory.getLogger(TestBase.class);
    @BeforeSuite
    public void setUp(){
        app.start();
    }
    @BeforeMethod
    public void startTest(Method m){
        logger.info("Start test " + m.getName());
    }

    @AfterMethod
    public void stopTest(Method m){
        logger.info("Stop test " + m.getName());
    }

    @AfterSuite(enabled = false)
    public void TearDown(){
        app.stop();
    }

}
