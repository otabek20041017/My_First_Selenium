package com.cydeo.utilities;

// TASK: NEW METHOD CREATION
//Method name: getDriver
//Static method
// Accepts String arg: browserType
// - This arg will determine what type of browser is opened
// - if "chrome" passed --> it will open chrome browser
// - if "firefox" passed --> it will open firefox browser
//RETURN TYPE: "WebDriver:

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) { // "Chrome"

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else {
            System.out.println("Given browser type doesn't exist/or not currently supported!");
            return null;
        }
    }

    public static void main(String[] args) {
        getDriver("chrome").get("https://www.google.com");
    }

}


