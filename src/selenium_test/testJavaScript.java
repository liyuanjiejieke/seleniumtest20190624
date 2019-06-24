package selenium_test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static org.junit.Assert.assertEquals;

public class testJavaScript {


    public void testJavaScriptCalls() {


        System.setProperty("webdriver.chrome.driver","D:\\soft\\chromdriver\\chromedriver.exe");//chromedriver服务地址
        WebDriver driver =new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = (String) js.executeScript("return document.title");
        assertEquals("百度一下，你就知道", title);
        long links = (Long) js.executeScript("var links = "
                + "document.getElementsByTagName('A'); "
                + "return links.length");
        assertEquals(26, links);
        driver.close();
    }
}
