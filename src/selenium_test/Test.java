package selenium_test;
import com.sun.jna.platform.win32.OaIdl;
import org.apache.commons.io.FileUtils;
import org.omg.CORBA.MARSHAL;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.Select;
import sun.awt.windows.WEmbeddedFrame;

import javax.print.DocFlavor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static java.lang.Thread.sleep;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertArrayEquals;
//import selenium.webdriver.common.keys;
public class Test {
    static WebDriver driver;
    public static void main(String[] args) {

        /*long a=Calendar.getInstance().getTimeInMillis();

        System.out.println(a);*/
       System.setProperty("webdriver.chrome.driver","D:\\soft\\chromdriver\\chromedriver.exe");//chromedriver服务地址
           driver =new ChromeDriver(); //新建一个WebDriver 的对象，但是new 的是FirefoxDriver的驱动
//        driver.get("https://www.baidu.com/");//打开指定的网站  https://www.imooc.com/
        driver.get("D:\\checkandradio.html");
//        /*    driver.get("https://baike.baidu.com/item/%E8%A1%A8%E6%A0%BC/3371820");*/


//        driver.manage().window().maximize();  //浏览器最大化
        //通过元素ID 属性
        /*driver.findElement(By.id("kw")).sendKeys("李元杰");
        driver.findElement(By.id("su")).click();*/

        //通过元素name属性
        //driver.findElement(By.name("userName")).sendKeys("AAA");

        //通过元素class name属性定位元素
        /*driver.findElement(By.className("s_ipt")).sendKeys("17878");
        driver.findElement(By.className("s_btn")).click();*/
 //<input type="submit" id="su" value="百度一下" class="bg s_btn">   class  空格代表多个命名


        //通过HTML标记名定位元素
        //driver.findElement(By.tagName("input")).sendKeys("selenuim");


        //通过文本定位链接
        //driver.findElement(By.linkText("新闻")).click();


        //通过部分文本定位链接
       // driver.findElement(By.partialLinkText("闻")).click();



        //通过xpath定位
        //driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("selenium");

        //通过css来定位
        //driver.findElement(By.cssSelector("#kw")).sendKeys("selenium");

        //webElement 类也可以支持查询子类元素，假设页面上有一些重复元素，但是他们在不同的<div>
        //中，可以先定位到其父元素<div>   然后在定位其子元素
        /*WebElement div=driver.findElement(By.id("u1")).findElement(By.linkText("新闻"));
        div.click();*/

       /* NoSuchElementFoundException
        findElement()和 findElements()方法弼找不到相应癿元素癿时候就会抛出 NoSuchElementFoundException 异常*/


       // 1.4  使用findElements方法定位元素
       //   Selenium WebDriver 提供了 findElements()方法，可以得到匹配指定觃则癿集合。弼 我们需要在一组相似癿元素上操作癿时候，返个方法会是非常有用癿。例如，我们可以得到 页面上所有癿链接戒是表格中所有癿行等等。
      /* List<WebElement> links=driver.findElements(By.cssSelector("#u1 a"));
       //验证链接数量
        //assertEquals(9,links.size());
        System.out.println(links.size());
        //打印href属性
        for (int i=0;i<links.size();i++) {
            System.out.println(links.get(i).getAttribute("href"));
        }*/




        //1.5
       /* WebElement username=driver.findElement(By.cssSelector("html > body > div > div > form > input"));
        username.sendKeys("SSSS");
*/

        //通过链接名来定位链接
        /*WebElement  gmailLinke =driver.findElement(By.linkText("新闻"));
        assertEquals("http://news.baidu.com/",gmailLinke.getAttribute("href"));

        System.out.println(gmailLinke.getAttribute("href")+"-------------------------------------");*/


        //通过部分链接名称定位链接
        /*WebElement inboxLink=driver.findElement(By.partialLinkText("123"));
        System.out.println(inboxLink.getText());*/


        // 1.6使用标签名称定位元素
        /*WebElement loginButton =driver.findElement(By.tagName("button"));
        loginButton.click();*/

        //统计<table> 中有多少行
       /* WebElement table=driver.findElement(By.className("log-set-param"));
        List<WebElement> rows = table.findElements(By.tagName("td"));
        System.out.println(rows.size()+"----------");*/


       //1.7 使用css选择器定位元素

        //使用绝对路径来定位元素//
        /*WebElement userName=driver.findElement(By.cssSelector("html body  div div div div"));
        List<WebElement> list=userName.findElements(By.className("mnav"));
        System.out.println(list.size());*/

        //使用相对路径来定位元素
       /* WebElement username=driver.findElement(By.cssSelector("input"));

        WebElement loginButton=driver.findElement(By.cssSelector("input.login"));
        WebElement loginButton2=driver.findElement(By.cssSelector(".login"));*/

       //使用相对ID 选择器来定位元素
        /*WebElement username3=driver.findElement(By.cssSelector("input#kw"));
        username3.sendKeys("哈哈");*/

        //使用属性来定位元素
        /*WebElement username=driver.findElement(By.cssSelector("input[name=wd]"));
        username.sendKeys("nihao");*/

        //使用多个属性来定位<input> 元素
       /* WebElement previousButton=driver.findElement(By.cssSelector("input[name=wd]"));
        previousButton.sendKeys("hello world");*/

       //部分属性值的匹配

        // 以 XXX 开始 例如，如果一个元素癿ID是ctrl_12, 就可以定位到此元素，匹配到 id 癿头 部 ctrl
         /*WebElement uname=driver.findElement(By.cssSelector("input[id^='k']"));
         uname.sendKeys("kkk");*/

        //以 XXX 结尾 例如，如果一个元素癿 ID 是 a_1_userName,返将会匹配到 id 癿 尾部_userName
        /*WebElement uname=driver.findElement(By.cssSelector("input[id$='w']"));
        uname.sendKeys("kkk");*/
        //包含 例如，如果一个元素癿 ID 是 panel_ login_userName_textfield，返 将会匹配到此 id 值癿_userName，从 而定位到元素rName，从 而定位到元素
       /* WebElement uname3=driver.findElement(By.cssSelector("input[id*='w']"));
        uname3.sendKeys("kkk");*/


       //1.8  使用Xpath 定位元素
        //通过绝对路径来定位元素
        //find_element_by_xpath("/html/head/body/script/div/script/div/div/div/div//div/style/div/a/form/span/span/input)
       /*WebElement uname=driver.findElement(By.xpath("/html/head/body/div/div/div/div/div/form/span/input"));
       uname.sendKeys("lelel");*/

       //通过相对路径定位元素
        /*WebElement uname=driver.findElement(By.xpath("//form//span//input"));
        uname.sendKeys("lkuhj");*/


        //使用索引来定位元素  //*[@id="u1"]/a[2]
        /*WebElement uname=driver.findElement(By.xpath("//input[2"));
        uname.click();*/

        // 使用Xpath 及单个、多个属性值定位元素
        /*WebElement  uname=driver.findElement(By.xpath("//input[@id='kw']"));
        uname.sendKeys("HHH");*/

        /*  WebElement  uname=driver.findElement(By.xpath("//input[@id='kw'][@name='wd']"));
        uname.sendKeys("HHH");

      //使用Xpath 和 and 操作符也同样可以达到相同的效果
        WebElement previousButton = driver.findElement  (By.xpath("//input[@type='submit'and @value='百度一下']"));
        previousButton.click();

        //使用or操作符和任何一个属性满足也可以对元素定位
        WebElement uu=driver.findElement(By.xpath("//input[@type='submit' or @value='百度一下']"));
        uu.click();*/

        //使用Xpath及属性名称定位元素
        /*List<WebElement> imagesalt=driver.findElements(By.xpath("//img[@src]"));
        System.out.println(imagesalt.size());*/

        // 以 XX开始
        /*WebElement name=driver.findElement(By.xpath("//input[starts-with(@id,'k')]"));
        name.sendKeys("PPP");*/

        //以 XX结束
        /*WebElement name2=driver.findElement(By.xpath("//input[ends-with(@class,'_ipt')]"));
        name2.sendKeys("PPP1");*/

        //包含 XX
       /* WebElement name=driver.findElement(By.xpath("//input[contains(@id,'k')]"));
        name.sendKeys("PPP");*/

       //使用值来匹配任意属性元素
       /* WebElement uanme =driver.findElement(By.xpath("//input[@*='kw']"));
        uanme.sendKeys("yyyyyyy");*/

       //使用Xpath轴来定位元素

        //1.9    使用文本元素

        //使用css选择器伪类定位元素
//        WebElement cell =driver.findElement(By.cssSelector("a:contains('新闻')"));
//        WebElement news=driver.findElement(By.cssSelector("a[innerTex'新闻']"));
        /*WebElement news = driver.findElement (By.cssSelector("a[textContent='新闻']"));
        news.click();*/

        //使用Xpath的text函数
        //使用Xpath精确文本定位元素

        //1.10使用高级的css 选择器

        //查询兄弟元素
        /*WebElement web=driver.findElement(By.cssSelector("#nv a + b"));
        web.click();*/

        //使用用户操作伪类   也可以使:hover 和:active 伪类来定位元素
       /* WebElement kk=driver.findElement(By.cssSelector("input:focus"));
        kk.sendKeys("LL");*/

       //使用UI状态伪类      enabled,disable,checked。
        //                    启用、   禁用、   选中
        /*:enabled input:enabled
        定位所有属性为enable癿 input 癿元素
        :disabled input:disabled
        定位所有属性为 disabled 癿 input 癿元素
        :checked input:checked
        定位所有多选框属性为 checked 癿元素*/

        //1.11  使用 jQuery 选择器


        //检查元素的文本
//        String elementText=driver.findElement(By.xpath("//div[@id='ftConw']/p/a[1]")).getText();
       // String elementText=driver.findElement(By.xpath("//*[@id=\"setf\"]")).getText();
//        assertEquals("把百度设为主页",elementText);
       // System.out.println(elementText+"=============================");

        //检查元素的属性值
       /* WebElement message=driver.findElement(By.className("s_btn"));
        String attribute=message.getAttribute("value");
        String type=message.getAttribute("type");
        System.out.println(attribute+"------"+type);*/


       //检查元素的CSS属性值

       /* WebElement message=driver.findElement(By.className("s_btn"));
        String width=message.getCssValue("width");
        System.out.println(width);*/

       //2.5针对鼠标和键盘事件使用高级的用户交互API

        //2.6 在元素上执行双击操作

        /*driver.get("D:\\doubleClickDemo.html");
        WebElement message = driver.findElement(By.id("yuanjie"));
        //  验证初始字体为14px

        Actions builder = new Actions(driver);
        builder.doubleClick(message).build().perform();*/


        /*WebElement login=driver.findElement(By.id("js-signin-btn"));
        //创建动作对象，并且指定操作的浏览器
        Actions actions=new Actions(driver);
        //单击操作传入参数，并且使用perform()提交,生效
        actions.click(login).perform();*/

        //2.8  之行javaScript  代码
//        testJavaScriptCalls();


        //2.9  使用Selenium  WebDriver  进行截图
//        testTakesScreenhot();

        //2.10 使用RemoteWebDriver/Grid 迚行截
//        testRemoteWebDriverScreenShot();

        //2.11  将浏览器最大化
//        driver.manage().window().maximize();

        // 自动选择下拉列表
        /*WebElement uname=driver.findElement(By.name("userName"));
        uname.sendKeys("SHfenzhangcsL");
        WebElement passworld=driver.findElement(By.name("passWord"));
        passworld.sendKeys("111qqq");

        WebElement buttonlogin=driver.findElement(By.className("login-btn"));

        buttonlogin.click();*/
//        driver.manage().window().maximize();

        //得到下拉列表框
        /*WebElement ss=driver.findElement(By.linkText("学习中心"));
        ss.click();*/

//       Select make=new Select(driver.findElement(By.name("form:jhdbh")));
       /* List <WebElement> webElements = make.getOptions();
      *//*String aa= make.getFirstSelectedOption().getText();
        System.out.println(aa+"-------"+webElements.get(2).getText());*//*
//        WebElement a2=webElements.get(1);

         //验证下拉列表的不支持多选Oracle
        assertFalse(make.isMultiple());
        //验证下拉列的数量
        assertEquals(3,make.getOptions().size());
        //命名用可见的文本来选择选项*/


   /*     make.selectByVisibleText("高风险2");
//        make.deselectByVisibleText("高风险3");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        make.selectByVisibleText("高风险3");
*/

//   2.13  检查下拉列表中的选项

        /*//通过可见文本来选择
        make.selectByVisibleText("高风险3");
        assertEquals("高风险3",make.getFirstSelectedOption().getText());

        //通过索引来选择
        make.selectByIndex(3);
        assertEquals("高风险4",make.getFirstSelectedOption().getText());*/

       /* make.selectByVisibleText("高风险1");
        make.selectByVisibleText("高风险2");
        make.selectByVisibleText("高风险3");


        //验证所选的选项
//        List<String> exp=Arrays.asList(new String []{"高风险1","高风险2","高风险3"});
        List<String> exp=Arrays.asList(new String []{"高风险1","高风险2","高风险3"});
        List<String> asc=new ArrayList<String>();

        List<WebElement> exps=make.getAllSelectedOptions();
       for(WebElement webElement:exps){

           asc.add(webElement.getText());
       }


        System.out.println(exp.toArray());
        System.out.println(asc.toArray());*/
//        assertArrayEquals(exp.toArray(),asc.toArray());



        //2.14  自动选择单选按钮

        /*driver.findElement(By.xpath("/html/body/input[1]")).click();
        driver.findElement(By.xpath("/html/body/input[2]")).click();
        driver.findElement(By.xpath("/html/body/input[3]")).click();


        driver.findElement(By.xpath("/html/body/p/input[1]")).click();
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/p/input[2]")).click();*/

        //自动选择多选框

















        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        driver.close();
        driver.quit();//退出浏览器*/







     /*
        //
        //    driver.get("http://www.cnblogs.com");//打开指定的网站

       // driver.findElement(By.name("userName")).sendKeys(new  String[] {"SHfenzhang01"});
      /* driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys(new String("SHfenzhang01"));
        driver.findElement(By.name("passWord")).sendKeys(new  String[] {"111qqq"});*/
        /* driver.findElement(By.className("login-btn")).click();//登录*//*

       WebElement divlogin=driver.findElement(By.className("login"));
        divlogin.findElement(By.name("userName")).sendKeys(new  String[] {"SHfufeikaika03"});
        divlogin.findElement(By.name("passWord")).sendKeys(new  String[] {"111qqq"});
        divlogin.findElement(By.className("login-btn")).click();*/

        //driver.findElement(By.tagName("button")).click();
        //driver.findElement(By.cssSelector("html body div div "));  //绝对路径来来查找元素
        //driver.findElement(By.cssSelector("input")).sendKeys(new String("SHfenzhang01"));
        //driver.findElement(By.cssSelector("input.userName")).sendKeys(new String("SHfenzhang01"));
       // driver.findElement(By.name("passWord")).sendKeys(new  String[] {"111qqq"});
        //driver.findElement(By.cssSelector("button.login-btn")).click();//使用相对路径来定位元素
       //driver.findElement(By.id("kw")).sendKeys(new String[]{"小精灵"});
       //driver.findElement(By.cssSelector("input#su")).click();
      //  driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("SHfenzhang01");


  /*      WebElement name =driver.findElement(By.id("AAAAAAA"));
        WebElement paw=driver.findElement(By.name("SSSSS"));*/


        //driver.findElement(By.linkText("登录")).click();
        //使用Xpath获得登录
      //  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/button")).click();

        //driver.findElement(By.xpath("//button[@value='登录']")).click();
        //driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/a/span[1]").
       // driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[11]/a/span")).click();//
        //driver.findElement(By.className("has_sub")).click();//登录

    //    driver.findElement(By.linkText("营销中心 ")).click();



        //driver.findElement(By.className("subdrop")).click();


        // driver.findElement(By.name("百度一下")).click();
        //driver.findElement(By.xpath())\
        //通过TagName查找元素
      /*  List<WebElement> buttons = driver.findElements(By.tagName("div"));
      System.out.print("Button"+buttons.size());*/

        //*[@id="sidebar-menu"]/ul/li[2]/a/span[1]

      //  driver.findElement(By.xpath("//*[@id=\"home_fchome_info_content\"]/div[1]/div[5]/span[2]")).click();
        /*  driver.switchTo().frame("mainBox");
        driver.findElement(By.className("time  active ")).click();
        //driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/a/span[1]")).click();

        Thread.sleep(3000)
    List<WebElement> but=driver.findElements(By.tagName("input"));
      for(WebElement webElement:but){
          if(webElement.getAttribute("type").equals("text")){
              System.out.println("input text is :"+ webElement.getText());
          }
      }
*/

            /**
             * WebDriver自带了一个智能等待的方法。
             dr.manage().timeouts().implicitlyWait(arg0, arg1）；
             Arg0：等待的时间长度，int 类型 ；
             Arg1：等待时间的单位 TimeUnit.SECONDS 一般用秒作为单位。
             */
           // Thread.sleep(4000);
            //driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);

        /**
         * dr.quit()和dr.close()都可以退出浏览器,简单的说一下两者的区别：第一个close，
         * 如果打开了多个页面是关不干净的，它只关闭当前的一个页面。第二个quit，
         * 是退出了所有Webdriver所有的窗口，退的非常干净，所以推荐使用quit最为一个case退出的方法。
         */
       /* driver.close();
        driver.quit();//退出浏览器*/
       // test();
    }


    /*  @org.junit.Test
    public static void JQueryTest(){
        WebDriver driver1 =new InternetExplorerDriver();
        JavascriptException jse= (JavascriptException) driver1;
        driver1.get("http://www.jquery.com/");
        List<WebElement> elements = (List<WebElement>)jse.executeScript("return jQuery.find" + "('.menu-item a:even')");
    }*/
    public static void test() {
        System.setProperty("webdriver.chrome.driver","D:\\soft\\chromdriver\\chromedriver.exe");//chromedriver服务地址
        WebDriver driver =new ChromeDriver();
       // WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.baidu.com");
        List<WebElement> links = driver.findElements(By.cssSelector("#nv a"));
        //验证链接数量
        assertEquals(10, links.size());
        //打印href属性
        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getAttribute("href"));
        }
        driver.close();
    }




    //批量生成测试数据
    public void createdata() throws Exception{

        FileWriter fstream = new FileWriter("C:\\Users\\user\\Desktop\\yuanjie1.txt",true);
        BufferedWriter bw = new BufferedWriter(fstream) ;

        for (int i = 0; i <=10 ; i++) {
            bw.write("liming"+i+","+i+","+"EM2676377686A"+i+"\n");
        }
        bw.close();
        fstream.close();
    }

    public static void testJavaScriptCalls() {

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String title = (String) js.executeScript("return document.title");
//        assertEquals("百度一下，你就知道", title);
//        /*long links = (Long) js.executeScript("var links = "
//                + "document.getElementsByTagName('A'); "
//                + "return links.length");
//        assertEquals(26, links);





//        System.out.println(title+"--------------------");
//        System.out.println(links+"-------");

//        System.out.println(a);
    }

    //
    public static void testTakesScreenhot(){
        try {
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


            FileUtils.copyFile(srcFile,new File("d:\\\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //使用RemoteWebDriver/Grid  进行截图
    public static void testRemoteWebDriverScreenShot(){
        driver=new Augmenter().augment(driver);

        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(scrFile,new File("D:\\\\screenshot1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
