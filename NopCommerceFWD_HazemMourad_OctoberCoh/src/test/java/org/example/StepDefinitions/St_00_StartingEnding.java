package org.example.StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class St_00_StartingEnding {
    public static WebDriver driver = null;
    public static Properties prop;
   // public static  Logger log;

    @Before
    public static void openBrowser() throws IOException {
       // log.debug("the driver is iniated here ");
        String propPth=System.getProperty("user.dir")+"\\src\\test\\java\\org\\example\\StepDefinitions\\data.properties";
        FileInputStream fis=new FileInputStream(propPth);
        prop =new Properties();
        prop.load(fis);
        String browserName=prop.getProperty("browser");

        if(browserName.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if(browserName.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }else if(browserName.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();
            driver = new InternetExplorerDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public static void quitDriver() throws InterruptedException {
       // log.debug("Terminate the operations");
        Thread.sleep(5000);
        driver.quit();
    }

//    public String takeScreenshot(String testName,WebDriver driver) throws IOException {
//
//        File SourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        String destinationFilePath = System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
//        FileUtils.copyFile(SourceFile,new File(destinationFilePath));
//        return destinationFilePath;
//
//    }

}
