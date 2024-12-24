package RedCapCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab006_AwesomeQAproject_Practise1 {

    @Test
    public void f1(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement Firstname = driver.findElement(By.name("firstname"));
        Firstname.sendKeys("Sindhuja");

        WebElement Lastname = driver.findElement(By.name("lastname"));
        Lastname.sendKeys("Jayaraman");

        WebElement Sex = driver.findElement(By.id("sex-1"));
       // Sex.sendKeys("sex-1");
        Sex.click();

        WebElement Experience = driver.findElement(By.id("exp-6"));
       // Experience.sendKeys("exp-6");
        Experience.click();

        WebElement Date = driver.findElement(By.id("datepicker"));
        Date.sendKeys("2024-24-12");

        WebElement Profession = driver.findElement(By.id("profession-1"));
       // Profession.sendKeys("exp-6");
        Profession.click();

        WebElement Tools = driver.findElement(By.id("tool-2"));
       // Tools.sendKeys("tool-2");
        Tools.click();
    }
}
