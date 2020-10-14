package com.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.List;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        openSite("https://yandex.ru/");

    }

    public void filterItem(Item item) {
        click(By.cssSelector("[href^='/catalog--"+ item.getItemType() +"']"));

        type(By.cssSelector("[id='glpricefrom']"), item.getPriceFrom());
        type(By.cssSelector("[id='glpriceto']"), item.getPriceTo());

        click(By.xpath("//span[text()='"+ item.getBrand() +"']"));
    }

    public void selectComputerDepartment() {
        click(By.cssSelector("[href*='kompiuternaia-tekhnika']"));
    }

    public void goToMarket() {
        click(By.cssSelector("[data-id='market']"));
    }

    public void switchToNextTab() {
        List<String> availableWindows = new ArrayList<>(wd.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            wd.switchTo().window(availableWindows.get(1));
        }

    }

    public void openSite(String url) {
        wd.navigate().to(url);
    }

    public void type(By locator, String text) {

           click(locator);
           wd.findElement(locator).clear();
        if(text != null) {
           wd.findElement(locator).sendKeys(text);
       }
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }
}
