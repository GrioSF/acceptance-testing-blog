package acceptance.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage extends BasePage {

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public void go() {
        this.driver.get("http://www.amazon.com");
    }

    public void searchForProduct(String productName) {
        searchBox().sendKeys(productName);
        searchBox().submit();
    }

    private WebElement searchBox() {
        return driver.findElement(By.id("twotabsearchtextbox"));
    }

}
