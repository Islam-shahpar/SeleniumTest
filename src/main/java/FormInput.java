import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FormInput {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        // FORM INPUT: TEXT
        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("book");
        driver.findElement(By.id("nav-search-submit-button")).submit();
        Thread.sleep(1000);

        // FORM INPUT: RADIO BUTTON
        driver.get("http://demo.guru99.com/test/radio.html");
        driver.findElement(By.id("vfb-7-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("vfb-7-2")).click();
        Thread.sleep(1000);

        // FORM INPUT: CHECK BOX
        driver.findElement(By.id("vfb-6-0")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("vfb-6-1")).click();
        Thread.sleep(1000);

        // FORM INPUT: MULTIPLE CHECK BOX
        final List<WebElement> elements = driver.findElements(By.cssSelector("input[type='checkbox']"));
            // Loop over all checkbox and clicking on them
        for(WebElement element: elements){
            element.click();
        }
        Thread.sleep(1000);

        // FORM INPUT: DROP-DOWN
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");

        // FORM INPUT: Filling out a full form
        driver.get("http://demo.guru99.com/test/newtours/register.php");

        driver.findElement(By.name("firstName")).sendKeys("jack");
        driver.findElement(By.name("lastName")).sendKeys("smith");
        driver.findElement(By.name("phone")).sendKeys("7034567898");
        driver.findElement(By.name("userName")).sendKeys("smith0001");
        driver.findElement(By.name("address1")).sendKeys("9345 burke road");
        driver.findElement(By.name("city")).sendKeys("springfield");
        driver.findElement(By.name("state")).sendKeys("VA");
        driver.findElement(By.name("postalCode")).sendKeys("22015");

        Select dropCountry = new Select(driver.findElement(By.name("country")));
        dropCountry.selectByVisibleText("ANTARCTICA");

        driver.findElement(By.name("email")).sendKeys("smith0001@gmail.com");
        driver.findElement(By.name("password")).sendKeys("smith0001");
        driver.findElement(By.name("confirmPassword")).sendKeys("smith0001");

        Thread.sleep(1000);

        driver.findElement(By.name("submit")).submit();

        Thread.sleep(1000);

        driver.close();
        driver.quit();
    }
}
