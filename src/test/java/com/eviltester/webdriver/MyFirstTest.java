package com.eviltester.webdriver;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by luis.serna on 11/6/2014.
 */
public class MyFirstTest {

    @Test
    public void startWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://stackoverflow.com/");
        Assert.assertTrue("title should start differently", driver.getTitle().startsWith("Stack Overflow"));
        driver.close();
    }

}
