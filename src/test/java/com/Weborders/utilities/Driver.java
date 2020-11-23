package com.Weborders.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    // reference variable , pointer on object
    // if reference variable does not point on any object it will have a vlaue
    // whenever we type new CLass() - we create new object
    // refence type can be parent class , or interface implement by class or parent class
    // since webdriver is an interface implemented by remote webdriver vlass
    // and remote web driver is parent class of chrme drive r, firefox driver
    // we can spificy refrence type as a webdriver
    // it helos to define object in a run time (polymorphomisim)
    private static WebDriver driver;
    private WebDriver Driver(){
     if(driver== null) {
         String browser= "chrome";
         switch (browser){
             case "chrome":
                 WebDriverManager.chromedriver().setup();
                 driver= new ChromeDriver();
                 break;
             case "firefox)":
                 WebDriverManager.firefoxdriver().setup();
                 driver= new FirefoxDriver();
                 break;
             default:
                 throw new RuntimeException("browser is not implemented yet: "+browser);

         }

     }
                         return driver;
    }

}
