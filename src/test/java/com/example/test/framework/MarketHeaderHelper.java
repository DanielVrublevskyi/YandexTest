package com.example.test.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketHeaderHelper extends HelperBase{

    public MarketHeaderHelper(WebDriver wd) {
        super(wd);
    }

    public void selectComputerDepartment() throws InterruptedException {
       Thread.sleep(3000);
        click(By.cssSelector("[href*='kompiuternaia-tekhnika']"));
    }

    public void searchItemFromSearchBox(String itemName) {
        type(By.cssSelector("[id='header-search']"),itemName);
        click(By.cssSelector("[type='submit']"));
    }
}
