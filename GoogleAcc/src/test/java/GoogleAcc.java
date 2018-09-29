import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class GoogleAcc {

    @Test
    public void gmailEnter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Programing\\QA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/");

        driver.findElement(By.id("identifierId")).sendKeys("iryna1yeremenko");
        driver.findElement(By.id("identifierNext")).click();

        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("Qwerty12345!");
        driver.findElement(By.id("passwordNext")).click();

        //webDriver.quit(); закомментировано чтобы окно не закрывалось сразу после теста,
        // чтобы можно было увидеть на самом ли деле пользователь залогинился
    }

    @Test
    public void gmailNoEnter() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Programing\\QA\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.get("https://accounts.google.com/");

        webDriver.findElement(By.id("identifierId")).sendKeys("faq.yeahh");
        webDriver.findElement(By.id("identifierNext")).click();

        Thread.sleep(2000);

        webDriver.findElement(By.name("password")).sendKeys("Qwerty12345");
        webDriver.findElement(By.id("passwordNext")).click();

        //webDriver.quit(); закомментировано чтобы окно не закрывалось сразу после теста,
        // чтобы можно было увидеть на самом ли деле пользователь не залогинился
    }
}
