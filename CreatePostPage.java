package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePostPage {
    WebDriver driver;

    @FindBy(xpath = "//button[normalize-space()='+ Create Post']")
    WebElement createPostButton;

    @FindBy(xpath = "//input[@placeholder='Title']")
    WebElement titleInput;

    @FindBy(xpath = "//input[@placeholder='Summary']")
    WebElement summaryInput;

    @FindBy(xpath = "//input[@type='file']")
    WebElement fileUpload;

    @FindBy(xpath = "//div[@class='ql-editor ql-blank']") 
    WebElement contentEditor;

    @FindBy(xpath = "//button[normalize-space()='Create Post']")
    WebElement submitButton;

    public CreatePostPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createNewPost(String title, String summary, String filePath, String content) {
        createPostButton.click();
        titleInput.sendKeys(title);
        summaryInput.sendKeys(summary);
        fileUpload.sendKeys(filePath);
        contentEditor.sendKeys(content);
        submitButton.click();
    }
}
