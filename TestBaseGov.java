package gov.il;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBaseGov {

    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wd.navigate().to("https://www.gov.il/he");
    }

    public void openDetails() throws InterruptedException {
        openSection(By.cssSelector("[name='BureausItemUrlButton0']"));
    }

    public void selectOutcome() throws InterruptedException {
        openSection(By.xpath("//span[contains(.,'רשות האוכלוסין וההגירה - נתניה')]"));
    }

    public void openCity() throws InterruptedException {
        openSection(By.cssSelector("[id='city']>[label='נתניה']"));
    }

    public void selectOffice() throws InterruptedException {
        openSection(By.cssSelector("[val='רשות האוכלוסין וההגירה']"));
    }

    public void openOficesList() throws InterruptedException {
        openSection(By.cssSelector("[id='autocompleteArrow_']"));
    }

    public void openReceptionPoints() throws InterruptedException {
        openSection(By.cssSelector("[id='tm-4']"));
    }

    public void openSection(By selector) throws InterruptedException {
        click(selector);
        pause();
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void pause() throws InterruptedException {
        Thread.sleep(3000);
    }
}
