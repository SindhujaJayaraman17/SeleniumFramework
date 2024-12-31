package RedCapCloud;

import net.bytebuddy.asm.Advice;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Lab010_idrive360_Login {
    @Test
    public void fn1() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        driver.manage().window().maximize();
        Thread.sleep(20000);

        //<input _ngcontent-rfr-c4="" autofocus="" class="id-form-ctrl ng-pristine ng-valid ng-touched" id="username" name="username" type="email" fdprocessedid="1kf8">
        WebElement Enterusername = driver.findElement(By.xpath("//input[@id='username']"));
        Enterusername.sendKeys("augtest_040823@idrive.com");

        Thread.sleep(30000);
        //<input _ngcontent-rfr-c4="" class="id-form-ctrl ng-untouched ng-pristine ng-valid" id="password" maxlength="20" name="password" tabindex="0" type="password" fdprocessedid="4swnu">
        //WebElement Enterpassword = driver.findElement(By.xpath("//input[@id='password'"));
        WebElement Enterpassword = driver.findElement(By.id("password"));
        Enterpassword.sendKeys("123456");

        Thread.sleep(20000);
        //<button _ngcontent-rfr-c4="" class="id-btn id-info-btn-frm" id="frm-btn" type="submit" fdprocessedid="lld4">Sign in</button>
        WebElement SigninClick = driver.findElement(By.xpath("//button[@id='frm-btn']"));
        SigninClick.click();

        Thread.sleep(30000);

        //<div _ngcontent-ftn-c10="" class="id-card-cont">
        // <i _ngcontent-ftn-c10="" class="id-expire-msg-icon">
        // </i>
        // <h5 _ngcontent-ftn-c10="" class="id-card-title">Your free trial has expired</h5>
        // <p _ngcontent-ftn-c10="">and your account has been canceled.</p>
        // <p _ngcontent-ftn-c10="">In order to reactivate your account, upgrade your account and save 25%*.</p>
        // </div>
        WebElement verifytext = driver.findElement(By.xpath("//div[@class='id-card-cont']"));

        Thread.sleep(30000);

        assertThat(verifytext.getText().equals("Your free trial has expired"));
       System.out.println("TextVerification:" +verifytext.getText());


    }
}