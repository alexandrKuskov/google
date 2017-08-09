import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleCheck {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
      driver = new FirefoxDriver();
      System.setProperty("webdriver.firefox.marionette", "C:\\ll\\geckodrivergeckodriver.exe");

    }

    @Test(description = "assertSearchLine")
    public void assertSearchLine(){
       driver.get("https://www.google.com.ua");
        System.out.println(driver.findElement(By.cssSelector("a.gb_P")).getText());
       boolean isDisplayed = driver.findElement(By.cssSelector("input.gsfi[name=q]")).isDisplayed();

       if(isDisplayed){
           System.out.println("Element is displayed on page.");
       }else{
           System.out.println("Element isn't displayed");
       }
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        driver.quit();
    }
}
