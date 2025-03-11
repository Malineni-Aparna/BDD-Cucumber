package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SigninPage 
{
    WebDriver driver;

    @FindBy(how=How.LINK_TEXT, using= "Sign in")
    WebElement signinLink;

    @FindBy(how=How.NAME, using = "login")
    WebElement username;

    @FindBy(how=How.ID, using = "password")
    WebElement password;

    @FindBy(how=How.NAME, using = "proceed")
    WebElement signinBtn;

    @FindBy(how=How.LINK_TEXT, using = "« Back to login page")
    WebElement capcha;

    
    public SigninPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize the elements
    }


    public void clickSignInLink() 
    {
        signinLink.click();
    }

    public void enterUsername(String usernameText) 
    {
        username.sendKeys(usernameText);
    }

    public void enterPassword(String passwordText) 
    {
        password.sendKeys(passwordText);
    }

    public void clickSigninBtn() 
    {
        signinBtn.click();
    }

    public boolean capchaIsVisible() 
    {
        return capcha.isDisplayed();
    }

}