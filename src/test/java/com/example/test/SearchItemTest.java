package com.example.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class SearchItemTest extends TestBase{

    @Test
    public void testItem(){
        goToMarket();

        switchToNextTab();
        selectComputerDepartment();

        filterItem(new Item("planshety", "20000", "35000", "Apple"));
//        WebElement item = wd.findElement
//                (By.xpath("//*[@data-autotest-id='product-snippet'][2]"));
//        String itemName = item.findElement(By.xpath(".//h3")).getText();
        String itemName = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]//h3")).getText();


    }


}
