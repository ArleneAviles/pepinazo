package todoist;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TodoistStepDefinition {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUpTest() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable - notifications");

        driver = new ChromeDriver(opt);
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().setSize(new Dimension(1366, 780));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDownTest() {
        driver.quit();
    }

    @Given("I navigate to todoist")


    @Given("I have the correct email credentials")
    public void iHaveTheCorrectEmailCredentials() {
        driver.get("https://todoist.com");
    }

    @When("I navigate to todoist site")
    public void iNavigateToTodoistSite() {
        //click login button
        driver.findElement(By.cssSelector("[href='/users/showlogin']")).click();

        WebElement userNameTxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        //enter username
        userNameTxt.sendKeys("jomarnavarro@gmail.com");
        //enter password
        driver.findElement(By.id("password")).sendKeys("Test@1234");
        //click login button
        driver.findElement(By.cssSelector(".submit_btn")).click();
    }

    @Then("I will be in the todoist Page")
    public void iWillBeInTheTodoistPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text() = 'Inbox']")));
    }

    @Given("I have a google account")
    public void iHaveAGoogleAccount() {
        driver.get("https://todoist.com");
    }
    @When("I click on continue with google button")
    public void iClickOnContinueWithGoogleButton(){
        //click Continue with Google button
        driver.findElement(By.cssSelector(".ist_button.ist_button_google")).click();

        WebElement gmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name=\'identifier\']")));

        gmailField.sendKeys("aabigail78@gmail.com");
        driver.findElement(By.cssSelector("#identifierNext .CwaK9")).click();

        WebElement gmailPwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name=\'password\']")));
        gmailPwd.sendKeys("Gondor1014");
        driver.findElement(By.cssSelector("#passwordNext .CwaK9")).click();
    }

    @Then("I will see a confirmation page")
    public void iWillSeeAConfirmationPage() {
    }

}
