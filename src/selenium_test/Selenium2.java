package selenium_test;

import static org.junit.Assert.*;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Selenium2 {
    WebDriver driver = new InternetExplorerDriver();
    JavascriptExecutor jse = (JavascriptExecutor)driver;

    public void jQueryTest() {
        driver.get("http://www.jquery.com/");

        List<WebElement> elements =
                (List<WebElement>)jse.executeScript("return jQuery.find" + "('.menu-item a:even')");
        assertEquals(3,elements.size());
        assertEquals("Download",elements.get(0).getText());
        assertEquals("Blog",elements.get(1).getText());
        assertEquals("Browser Support",elements.get(2).getText());
        driver.close();
    } }