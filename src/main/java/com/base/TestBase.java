package com.base;


import com.utilities.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static Properties prop;
    public static WebDriver driver;


    public TestBase(){
         prop = new Properties();
        FileInputStream ip = null;
        try {
            ip = new FileInputStream("src/main/java/com/config/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void initialization(){
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        } else if (browserName.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Custom Program\\Selenium Java\\Selenium__Java\\src\\Driver\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }

}
