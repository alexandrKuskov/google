import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
    By searchLine = By.id("lst-ib");
    By searchButton = By.name("btnK");

    private final WebDriver driver;

    public GoogleSearch(WebDriver driver){
        this.driver = driver;
    }

    public GoogleSearch typeText(String text){
        driver.findElement(searchLine).sendKeys(text);
        return this;
    }

    public PageWithResult pushButton(){
        driver.findElement(searchButton).click();
        return new PageWithResult(driver);
    }

    public PageWithResult searchRequest(String text){
        typeText(text);
        return pushButton();
    }
}
