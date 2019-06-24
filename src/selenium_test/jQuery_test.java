package selenium_test;

import org.junit.Test;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class jQuery_test {
    WebDriver driver =new InternetExplorerDriver();
    JavascriptException jse= (JavascriptException) driver;



  /*  @Test
    public void JQueryTest(){

        driver.get("http://www.jquery.com/");
        List<WebElement> elements = (List<WebElement>)jse.executeScript("return jQuery.find" + "('.menu-item a:even')");

    }*/




}
