package RedCapCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class Lab007_FindTitlesineBay {
    @Test
    public void fn1(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        driver.manage().window().maximize();

        //*[@id="gh-ac"]
        WebElement searchbox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchbox.sendKeys("macmini");

        ////*[@id="gh-btn"] - using xpath copied from the html tag
//        WebElement searchbutton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
//        searchbutton.click();

        //using value
        WebElement searchbutton1 = driver.findElement(By.xpath("//input[@value='Search']"));
        searchbutton1.click();

        //to get xpath of the itemtitles
        //<div class="s-item__title"><span role="heading" aria-level="3"><!--F#f_0-->Mac mini, 2.3GHz Quad-Core Intel Core i7, 16GB, 1TB<!--F/--></span></div>
        List <WebElement> GetItemTitle = driver.findElements(By.xpath("//div[@class='s-item__title']"));

        //to get xpath of the itemprice
        //<span class="s-item__price"><!--F#f_0--><!--F#f_0-->$109.00<!--F/--><!--F/--></span>
        List <WebElement> GetItemPrice = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        //To get the minimum amongst 2 webelements
        int size = Math.min(GetItemTitle.size(),GetItemPrice.size());

        for(int i=0;i<size;i++)
        {
            System.out.println("Title: " +GetItemTitle.get(i).getText()+ "||" + "Price: " +GetItemPrice.get(i).getText());
        }

    }

}
