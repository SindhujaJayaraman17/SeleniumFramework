package RedCapCloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Lab005_Demoproject1_VerifyValid_Login {
    @Test
    public void fn1() throws Exception{
        ChromeOptions chrome = new ChromeOptions();
        chrome.addArguments("--start-maximized");

        ChromeDriver driver = new ChromeDriver(chrome);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        assertThat(driver.getTitle().equals("CURA Healthcare Service"));

        // ************ Step 1 - Clicking Make Appointment button **********************

            //<a
            // id="btn-make-appointment"
            // href="./profile.php#login"
            // class="btn btn-dark btn-lg">Make Appointment</a>
        WebElement make_appointment = driver.findElement(By.id("btn-make-appointment"));
        make_appointment.click();
        Thread.sleep(3000);

        // ************ Step 2 - Entering Valid username/password and verify navigation to next page  **********************

        //<input type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value="" autocomplete="off">

        //<input type="password"
        // class="form-control"
        // id="txt-password"
        // name="password"
        // placeholder="Password"
        // value="" autocomplete="off">

        assertThat(driver.findElement(By.id("txt-username")));
        WebElement Element_Username = driver.findElement(By.id("txt-username"));
        Element_Username.sendKeys("John Doe");

        assertThat(driver.findElement(By.id("txt-password")));
        WebElement Element_Password = driver.findElement(By.id("txt-password"));
        Element_Password.sendKeys("ThisIsNotAPassword");

        //<button
        // id="btn-login" type="submit"
        // class="btn btn-default">Login</button>

        WebElement Submit = driver.findElement(By.id("btn-login"));
        Submit.click();
        assertThat(driver.getCurrentUrl().equals("https://katalon-demo-cura.herokuapp.com/#appointment"));


    }
}
