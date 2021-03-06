package com.example.test.tests;

import com.example.test.framework.HelperBase;
import com.example.test.model.Item;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchItemTest extends TestBase {

    @Test
    public void testItem() throws InterruptedException {
//        app.openSite("https://yandex.ru/");
        app.getMainPage().goToMarket();
        Thread.sleep(3000);
        app.getMainPage().switchToNextTab();


        app.getMarketHeader().selectComputerDepartment();
        Thread.sleep(2000);

        app.getMarketItem().filterItem(new Item()
                .setItemType("planshety")
                .setPriceFrom("20000")
                .setPriceTo("35000")
                .setBrand("Apple"));

//        WebElement item = wd.findElement
//                (By.xpath("//*[@data-autotest-id='product-snippet'][2]"));
//        String itemName = item.findElement(By.xpath(".//h3")).getText();


        Thread.sleep(2000);

        String itemName = app.getMarketItem().getItemNameFromListByOrder(2);
        System.out.println(itemName);
        Thread.sleep(2000);

        app.getMarketHeader().searchItemFromSearchBox(itemName);
        Thread.sleep(2000);

        String foundItemName = app.getMarketItem().getItemNameFromListByOrder(1);
        Assert.assertEquals(foundItemName,itemName);

    }

//C:\Users\Daniel\Documents\GitHub\YandexTest> gradlew -Pbrowser=firefox clean testy
//    C:\Users\Daniel\Documents\GitHub\YandexTest> gradlew testy



}
