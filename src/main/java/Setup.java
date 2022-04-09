import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
    public static void main(String[] args) throws InterruptedException{
        //Setup the Webdriver for Chromedriver
        WebDriverManager.chromedriver().setup();

        //Define a new ChoromeDriver Object named "driver"
        ChromeDriver driver = new ChromeDriver();

        //Use to driver visit the google.com URL
        driver.get("https://www.google.com/");

        //Wait for 2 seconds
        Thread.sleep(2000);

        //Quit the browser
        driver.quit();
    }
}
