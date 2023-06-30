package org.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    static WebDriver driver=null;
    public static WebDriver getBrowserDriver(String browserName){
        if(browserName.equalsIgnoreCase(String.valueOf(EBrowserName.GOOGLE))){
            driver= new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase(String.valueOf(EBrowserName.FIREFOX))){
            driver=new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase(String.valueOf(EBrowserName.IE))){
            driver=new InternetExplorerDriver();
        }
        else if(browserName.equalsIgnoreCase(String.valueOf(EBrowserName.EDGE)))
        {
            driver=new EdgeDriver();
        }
        else  if(browserName.equalsIgnoreCase(String.valueOf(EBrowserName.SAFARI))){
            driver=new SafariDriver();
        }
        else
        {
            return driver;
        }


      return driver;
    }
}
