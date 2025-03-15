package Tests;

import org.testng.annotations.Test;
import Pages.DashboardPage;
import Pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginFromDashboard() {
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.navigateToLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "password123");

    }
}
