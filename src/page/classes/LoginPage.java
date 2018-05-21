package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static WebElement element = null;


    public static WebElement emailBox(WebDriver driver){
        element = driver.findElement(By.id("email_create"));
        return element;
    }

    public static WebElement createAccountButton(WebDriver driver){
        element = driver.findElement(By.id("SubmitCreate"));
        return element;
    }

    public static void  clickOnCreateAccountButton(WebDriver driver){
        element = createAccountButton(driver);
        element.click();
    }

    public static WebElement loginEmailBox(WebDriver driver){
        element = driver.findElement(By.id("email"));
        return element;
    }

    public static WebElement loginPasswordBox(WebDriver driver){
        element = driver.findElement(By.id("passwd"));
        return element;
    }

    public static WebElement signInButton(WebDriver driver){
        element = driver.findElement(By.id("SubmitLogin"));
        return element;
    }

    public static void  clickOnSignInButton(WebDriver driver){
        element = signInButton(driver);
        element.click();
    }

}
