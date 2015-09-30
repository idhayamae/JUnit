import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class unittest {
    FirefoxDriver wd;
    
    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void sp() {
        wd.get("http://114.9.185.123/NextGenPay/");
        wd.findElement(By.id("MainContent_LoginUser_UserName")).click();
        wd.findElement(By.id("MainContent_LoginUser_UserName")).clear();
        wd.findElement(By.id("MainContent_LoginUser_UserName")).sendKeys("Verizon");
        wd.findElement(By.id("MainContent_LoginUser_Password")).click();
        wd.findElement(By.id("MainContent_LoginUser_Password")).clear();
        wd.findElement(By.id("MainContent_LoginUser_Password")).sendKeys("verizon");
        wd.findElement(By.id("MainContent_LoginUser_LoginButton")).click();
    }
    
    @After
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
