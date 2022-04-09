import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        // SELECT HTML ELEMENT USING ID LOCATOR
        WebElement email = driver.findElement(By.id("glow-ingress-line1"));
        System.out.println("Value for the email: " + email.getText());

        // SELECT HTML ELEMENT USING CLASSNAME LOCATOR
            // Let’s imagine we have a tag with the following attributes [id, class, name, value]
            // <input type="text" id="firstname" name="first_name" class="myForm">

            // The generic way to locate elements by attribute is:
            // css = element_name[<attribute_name>='<value>']

            // Example:
            // WebElement firstName = driver.findElement(By.cssSelector("input[name='first_name']"
        // Source: https://devqa.io/selenium-css-selectors/
        WebElement emailTwo = driver.findElement(By.cssSelector("input[name='field-keywords']"));
        System.out.println("Name of the tag for emailTwo: " + emailTwo.getTagName());

        // SELECT HTML ELEMENT USING NAME LOCATOR
            // NOTE: "name" only exist on form elements
            // Example: text, radio button, options, textarea, checkbox
        WebElement emailThree = driver.findElement(By.name("field-keywords"));
        System.out.println("Name of the tag for emailThree: " + emailThree.getTagName());

        // SELECT HTML ELEMENT USING LINKTEXT LOCATOR
            // NOTE: "linkText" only exists in href element
        WebElement emailFour = driver.findElement(By.linkText("Best Sellers"));
        System.out.println("Name of the tag for emailFour: " + emailFour.getTagName());


        driver.close();
        driver.quit();
    }
}
