package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    private By loginButton = By.xpath("//a[normalize-space()='Login']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.findElement(loginButton).click();
    }
}
