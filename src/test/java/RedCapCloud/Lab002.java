package RedCapCloud;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Lab002 {
@Test
    public void fn01(){
ChromeOptions chrome = new ChromeOptions();
    chrome.addExtensions(new File("src/test/java/RedCapCloud/adblock.crx"));

    ChromeDriver driver = new ChromeDriver(chrome);
    driver.get("https://www.youtube.com");

    System.out.println(driver.getTitle());
    driver.quit();
}
}
