package com.eviltester.webdriver;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.Arrays;
import java.util.List;

/**
 * Created by luis.serna on 11/6/2014.
 */
@RunWith(Parameterized.class)
public class MyFirstTest {

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[10][0]);
    }

    public MyFirstTest() {
    }

    @Test
    public void startWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://stackoverflow.com/");
        Assert.assertTrue("title should start differently", driver.getTitle().startsWith("Stack Overflow"));
        driver.close();
    }

}
