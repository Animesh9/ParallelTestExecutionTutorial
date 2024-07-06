package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.manage().deleteAllCookies();
//        Adding wait to visualize the process
        Thread.sleep(5000);

    }

    @AfterMethod
    public void tearDown() {
        try {

            if (driver != null) {
//                Printing just to current window handle to envision the flow and current Window
                System.out.println(driver.getWindowHandle());
                driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Error : ");
            e.printStackTrace();
            e.getMessage();
        }
    }
}
