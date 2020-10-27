package com.example.test.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageHelper extends HelperBase{
    public MainPageHelper(WebDriver wd) {
        super(wd);
    }

    public void goToMarket() {

        click(By.cssSelector("[data-id='market']"));
    }


    public boolean isFFormPresent (){
        return isElementPresent(By.cssSelector("[data-id='market']"));

    }
    public boolean isElementPresent (By locator){

        return wd.findElements(locator).size()>0;
    }
}
