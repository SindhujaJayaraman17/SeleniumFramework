package RedCapCloud;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Lab001 {
    @Test
    public void f1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.addArguments("--incognito");
       // driver.findElement("<textarea class=\"gLFyf\" aria-controls=\"Alh6id\" aria-owns=\"Alh6id\" autofocus=\"\" title=\"Search\" value=\"\" jsaction=\"paste:puy29d;\" aria-label=\"Search\" placeholder=\"\" aria-autocomplete=\"both\" aria-expanded=\"false\" aria-haspopup=\"false\" autocapitalize=\"off\" autocomplete=\"off\" autocorrect=\"off\" id=\"APjFqb\" maxlength=\"2048\" name=\"q\" role=\"combobox\" rows=\"1\" spellcheck=\"false\" data-ved=\"0ahUKEwjwjuiMo7CKAxXCdPUHHdUbIbsQ39UDCA8\" aria-activedescendant=\"\" style=\"\"></textarea>")
        //driver.quit();
    }
}
