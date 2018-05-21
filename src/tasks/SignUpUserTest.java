package tasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.classes.SignUpPage;
import page.classes.LoginPage;


public class SignUpUserTest {
    private WebDriver driver;
    private String baseUrl;
    private String signInButton = ".header_user_info .login";
    private String emailAddress = "recruitmenttask@gmail.com";



    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "../selenium/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseUrl = "http://automationpractice.com/index.php";
    }

    @Test
    public void test() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get(baseUrl);
        driver.findElement(By.cssSelector(signInButton)).click();
        LoginPage.emailBox(driver).sendKeys(emailAddress);
        LoginPage.clickOnCreateAccountButton(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("account-creation_form")));
        SignUpPage.firstNameBox(driver).sendKeys("Jakub");
        SignUpPage.lastNameBox(driver).sendKeys("Juszczak");
        Assert.assertEquals("wrong email",
                SignUpPage.emailBox(driver).getAttribute("value"), emailAddress);
        SignUpPage.passwordBox(driver).sendKeys("haslohaslo");
        SignUpPage.addressFirstLineBox(driver).sendKeys("Al. Jerozolimskie 136");
        SignUpPage.cityBox(driver).sendKeys("Warsaw");
        Select drpState = new Select(SignUpPage.stateDropdown(driver));
        drpState.selectByVisibleText("Alabama");
        SignUpPage.postalCodeBox(driver).sendKeys("55555");
        SignUpPage.mobilePhoneBox(driver).sendKeys("123456789");
        SignUpPage.clickOnRegisterButton(driver);
        Assert.assertTrue(driver.getTitle().contains("My account - My Store"));
    }

    @After
    public void tearDown() {
        driver.close();
    }
}