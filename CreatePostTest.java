package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.CreatePostPage;

public class CreatePostTest {
    WebDriver driver;
    CreatePostPage createPostPage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://write-wave-gamma.vercel.app/create");
        createPostPage = new CreatePostPage(driver);
    }

    @Test
    public void testCreatePost() {
        createPostPage.createNewPost(
                "My First Selenium Blog",
                "This is a test blog created using Selenium.",
                "C:\\Users\\User\\Desktop\\sample-image.jpg", 
                "This is the blog content written for testing automation."
        );
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
