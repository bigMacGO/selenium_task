package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    public static WebElement element = null;


    public static WebElement firstNameBox(WebDriver driver){
        element = driver.findElement(By.id("customer_firstname"));
        return element;
    }

    public static WebElement lastNameBox(WebDriver driver){
        element = driver.findElement(By.id("customer_lastname"));
        return element;
    }

    public static WebElement emailBox(WebDriver driver){
        element = driver.findElement(By.id("email"));
        return element;
    }

    public static WebElement passwordBox(WebDriver driver){
        element = driver.findElement(By.id("passwd"));
        return element;
    }

    public static WebElement addressFirstNameBox(WebDriver driver){
        element = driver.findElement(By.id("firstname"));
        return element;
    }

    public static WebElement addressLirstNameBox(WebDriver driver){
        element = driver.findElement(By.id("lastname"));
        return element;
    }

    public static WebElement addressFirstLineBox(WebDriver driver){
        element = driver.findElement(By.id("address1"));
        return element;
    }

    public static WebElement cityBox(WebDriver driver){
        element = driver.findElement(By.id("city"));
        return element;
    }

    public static WebElement stateDropdown(WebDriver driver){
        element = driver.findElement(By.id("id_state"));
        return element;
    }

    public static WebElement postalCodeBox(WebDriver driver){
        element = driver.findElement(By.id("postcode"));
        return element;
    }

    public static WebElement mobilePhoneBox(WebDriver driver){
        element = driver.findElement(By.id("phone_mobile"));
        return element;
    }

    public static WebElement registerButton(WebDriver driver){
        element = driver.findElement(By.id("submitAccount"));
        return element;
    }

    public static void  clickOnRegisterButton(WebDriver driver){
        element = registerButton(driver);
        element.click();
    }
}
