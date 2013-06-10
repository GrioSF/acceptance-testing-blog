package acceptance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductSearchResultsPage extends BasePage {

    public ProductSearchResultsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void assertResultsContainProduct(String productName) {
        this.driver.findElement(By.xpath("//span[contains(text(), '"+productName+"')]"));
    }
}

