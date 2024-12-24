package RedCapCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

// Open the https://katalon-demo-cura.herokuapp.com/
// Verify the title and search a string in pageSource
// Add assertion that the Cura heatlh care Service is visible in the page source.

@Test
public class Lab003 {
    public void f1() throws Exception {
//        ChromeOptions chrome = new ChromeOptions();
//        chrome.addArguments("--start-maximized");
//        ChromeDriver driver = new ChromeDriver(chrome);

        //Alternate way to maximize the window
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        driver.manage().window().maximize();

        assertThat(driver.getTitle().equals("CURA Healthcare Service"));
        assertThat(driver.getCurrentUrl().equals("https://katalon-demo-cura.herokuapp.com/"));
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");
            Assert.assertTrue(true);
        }else {
            throw new Exception("Heading NOT Found");
        }

        WebElement e = driver.findElement(By.id("btn-make-appointment"));
        e.click();
        Thread.sleep(3000);

       // driver.quit();
    }
}
