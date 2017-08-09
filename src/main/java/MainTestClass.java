import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

public class MainTestClass {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.firefox.marionette","C:\\ll\\geckodrivergeckodriver.exe");
        driver.get("http://www.google.com/");

//        GoogleSearch gs = new GoogleSearch(driver);
//
//        gs.searchRequest("Google");
//        driver.quit();
        GoogleWithFactory gwf = PageFactory.initElements(driver, GoogleWithFactory.class);
        gwf.searchFor("Cats");
        driver.quit();
    }
}
