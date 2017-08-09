import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleWithFactory {
    WebElement q;

    public void searchFor(String text) {
        q.sendKeys(text);
        q.submit();
    }
}
