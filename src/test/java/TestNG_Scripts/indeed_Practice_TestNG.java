package TestNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class indeed_Practice_TestNG {

    public WebDriver driver;



        @BeforeClass
        public void setup()
        {
            driver = new ChromeDriver();
            driver.get("https://www.indeed.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @Test
        public void Indeed_SignIn_validation() {

            driver.findElement(By.xpath("//div[@class='gnav-Logo-icon']")).isDisplayed();
            System.out.println("indeed application pass");
        }

       // driver.findElement(By.xpath("(//a[text()='Sign in'])[1]")).isDisplayed();
       // driver.findElement(By.xpath("//a[text()='Employers / Post Job']")).isDisplayed();
       // driver.findElement(By.xpath("(//a[text()='Sign in'])[1]")).click();

    @AfterClass
    public void TearDown()
    {

        driver.quit();
    }
}
