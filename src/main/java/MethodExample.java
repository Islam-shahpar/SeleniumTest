import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodExample {
    public static void main(String[] args) throws InterruptedException{
        // find the driver and use that
        WebDriverManager.chromedriver().setup();

        // Create driver instance
        ChromeDriver driver = new ChromeDriver();

        // invoke get Method
        // get() -> go to an address
        driver.get("https://www.amazon.com/");

        // invoke getCurrentURL Method
        // getCurrentUrl() -> get the current url and print
        System.out.println(driver.getCurrentUrl());

        // invoke getTitle() method
        // getTitle() -> get the current page title
        System.out.println(driver.getTitle());

        // invoke findElement Method
        // findElement() -> find an element from a page
        WebElement email = driver.findElement(By.id("glow-ingress-line1"));
        System.out.println("Value for element glow-ingress-line1: " + email.getText());

        // invoke getPageSource method
        // getPageSource() -> get the current page source
        System.out.println(driver.getPageSource());

        // invoke Thread.s;eep method for waiting 2 seconds
        Thread.sleep(2000);

        // invoke close method
        // close() -> Close the current window
        driver.close();

        // invoke quit method
        // quit() -> Quit the driver instance
        driver.quit();
    }
}
