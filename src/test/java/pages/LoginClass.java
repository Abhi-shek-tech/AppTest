package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;


public class LoginClass {
    
    private static AppiumDriver<WebElement> driver;
    
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    WebElement allowButton;
    
    @FindBy(xpath = "//android.widget.ImageView/following-sibling::android.view.ViewGroup[2]")
    WebElement englishButton;
    
    @FindBy(xpath = "//android.widget.ImageView/following-sibling::android.view.ViewGroup[3]")
    WebElement nextButton;
    
    @FindBy(className = "android.widget.EditText")
    WebElement editText;
    
    @FindBy(xpath = "//android.widget.EditText/following-sibling::android.view.ViewGroup[1]")
    WebElement nextButton2;
    
    @FindBy(xpath = "//android.widget.EditText/ancestor::android.view.ViewGroup[5]/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[7]/android.view.ViewGroup")
    WebElement month;
    
    @FindBy(xpath = "//android.widget.EditText/ancestor::android.view.ViewGroup[5]/following-sibling::android.view.ViewGroup/descendant::android.view.ViewGroup[7]/following-sibling::android.view.ViewGroup[12]/android.view.ViewGroup")
    WebElement next3;
    
    @FindBy(xpath = "//android.widget.EditText/ancestor::android.view.ViewGroup[5]/following-sibling::android.view.ViewGroup[2]/descendant::android.view.ViewGroup[8]/android.widget.TextView")
    WebElement skip;
    
    @FindBy(xpath = "//android.widget.HorizontalScrollView/descendant::android.view.ViewGroup[2]")
    WebElement dontAllow;
    
    public LoginClass(AppiumDriver<WebElement> driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void testLogin() throws InterruptedException {
        
        WebDriverWait wait = new WebDriverWait(driver, 25);
        
        // Click on Allow button
        wait.until(ExpectedConditions.elementToBeClickable(allowButton)).click();
        // Click on English button
        
        wait.until(ExpectedConditions.visibilityOf(englishButton));
        englishButton.click();
        // Click on Next button
        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
        
        // Enter the name
        wait.until(ExpectedConditions.visibilityOf(editText)).sendKeys("Everyone");
        
        // Click on Next button 2
        wait.until(ExpectedConditions.elementToBeClickable(nextButton2)).click();
        
        // Click on Month of pregnancy (1)
        wait.until(ExpectedConditions.elementToBeClickable(month)).click();
        
        // Click on Next button 3
        wait.until(ExpectedConditions.elementToBeClickable(next3)).click();
        
        // Click on Skip
        wait.until(ExpectedConditions.elementToBeClickable(skip)).click();
        
        // Click on DontAllow
        wait.until(ExpectedConditions.elementToBeClickable(dontAllow)).click(); 
    }
   
}
