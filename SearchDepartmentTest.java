package gov.il;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchDepartmentTest extends TestBaseGov{

    @Test
    public void testDepartment() throws InterruptedException {
        openReceptionPoints();
        openOficesList();
        selectOffice();
        openCity();
        selectOutcome();
        openDetails();

        String title = wd.findElement(By.xpath("//h1[contains(.,'רשות האוכלוסין וההגירה - נתניה')]")).getText();
        System.out.println(title);



    }


}
