package com.example.test.framework;

import com.example.test.model.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MarketItemHelper extends HelperBase{

    public MarketItemHelper(WebDriver wd) {
        super(wd);
    }

    public void filterItem(Item item) throws InterruptedException {
        click(By.cssSelector("[href^='/catalog--" + item.getItemType() + "']"));
        Thread.sleep(2000);
        type(By.cssSelector("[id='glpricefrom']"), item.getPriceFrom());
        Thread.sleep(2000);
        type(By.cssSelector("[id='glpriceto']"), item.getPriceTo());
        Thread.sleep(2000);
        click(By.xpath("//span[text()='"+ item.getBrand() +"']"));
        Thread.sleep(2000);
    }

    public String getItemNameFromListByOrder(int number) {
        return wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet']["+number+"]//h3")).getText();
    }
}
