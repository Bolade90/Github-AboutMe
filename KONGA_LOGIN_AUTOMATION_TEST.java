import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KONGA_LOGIN_AUTOMATION_TEST {


    // Import Selenium Web Driver
    private WebDriver driver;

    @BeforeTest
    public void start () throws InterruptedException {
        // Locate where the ChromeDriver is
        System.setProperty("webdriver.chrome.driver", "DRIVER/chromedriver.exe");
        // Open The Chrome Browser
        driver = new ChromeDriver();
        // Input The Konga URL (https://www.konga.com/)
        driver.get("https://www.konga.com/");
        Thread.sleep(5000);
        // Maximize the page
        driver.manage().window().maximize();
        // Click on the Login Page to Login
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
    }

        @Test
                public void login () throws InterruptedException {
        // Input Email Address on the Email Field
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("youngcool02@yahoo.com");
        //input Password on the Password Field
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("London83");
        // Click on the Login Button on the Login Page
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
        //Click on My Account
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/a/span")).click();
        Thread.sleep(3000);
        // Click on the Logout Button From the Page
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/ul/li[7]/a")).click();
    }

        @AfterTest
                public void closebrowser(){
        // Quit The Browser
        driver.quit();
    }
}
