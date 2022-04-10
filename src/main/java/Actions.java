import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        // ACTION-1: Clicking on the link
        WebElement email = driver.findElement(By.linkText("Best Sellers"));
        email.click();

        // Wait 1000 millisecond
        Thread.sleep(1000);

        // ACTION-2: Navigate back to previous webpage
        driver.navigate().back();

        // ACTION-3: Type "book" on the search box
        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("book");

        // Wait 1000 millisecond
        Thread.sleep(1000);

        // ACTION-4: Find the "submit" button and submit
        driver.findElement(By.id("nav-search-submit-button")).submit();

        // Wait 1000 millisecond
        Thread.sleep(1000);

        driver.close();
        driver.quit();
    }
}
