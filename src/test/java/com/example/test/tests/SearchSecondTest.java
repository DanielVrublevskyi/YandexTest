package com.example.test.tests;

import com.example.test.model.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchSecondTest extends  TestBase{
    @Test
    public void SecondTest() throws InterruptedException {
//       app.openSite("https://yandex.ru/");
//        app.getMainPage().goToMarket();
//
//        app.getMainPage().switchToNextTab();
        app.openMarket2();
        app.getMarketHeader().selectComputerDepartment();
        Thread.sleep(3000);

        app.getMarketItem().filterItem(new Item()
                .setItemType("graficheskie-planshety")
                .setPriceFrom("40000")
                .setPriceTo("80000")
                .setBrand("WACOM"));

        Thread.sleep(2000);

        String itemName = app.getMarketItem().getItemNameFromListByOrder(2);
        System.out.println(itemName);
        Thread.sleep(2000);

        app.getMarketHeader().searchItemFromSearchBox(itemName);
        Thread.sleep(2000);

        String foundItemName = app.getMarketItem().getItemNameFromListByOrder(1);
        Assert.assertEquals(foundItemName,itemName);

        
    }
}
