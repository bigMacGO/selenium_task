package tasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.classes.LoginPage;

public class AddWishlist {

    private WebDriver driver;
    private String baseUrl;
    private String signInButton = ".header_user_info .login";
    private String emailAddress = "recruitmenttask@gmail.com";
    private String password = "haslohaslo";
    private String wishlistName = "niezle ciuszki";

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "../selenium/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseUrl = "http://automationpractice.com/index.php";
    }

    @Test
    public void test() {
        driver.get(baseUrl);
        driver.findElement(By.cssSelector(signInButton)).click();
        LoginPage.loginEmailBox(driver).sendKeys(emailAddress);
        LoginPage.loginPasswordBox(driver).sendKeys(password);
        LoginPage.clickOnSignInButton(driver);
        Assert.assertTrue(driver.getTitle().contains("My account - My Store"));
        driver.findElement(By.cssSelector(".lnk_wishlist")).click();
        driver.findElement(By.id("name")).sendKeys(wishlistName);
        driver.findElement(By.id("submitWishlist")).click();
        String wishlistTitle = driver.findElement(By.xpath("//*[contains(text(),'niezle')]")).getText();
        Assert.assertEquals("wrong wishlist name", wishlistName, wishlistTitle);

    }

    @After
    public void tearDown() {
        driver.close();
    }
}
