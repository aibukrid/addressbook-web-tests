package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class GroupCreationTests {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        driver.get("http://localhost/addressbook/group.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        login("user", "pass", By.cssSelector("input:nth-child(7)"), "admin", "secret");
    }

    private void login(String user, String pass, By by, String username, String password) {
        returnToGroupPage(By.name(user));
        driver.findElement(By.name(user)).sendKeys(username);
        returnToGroupPage(By.name(pass));
        driver.findElement(By.name(pass)).sendKeys(password);
        returnToGroupPage(by);
    }

    @Test
    public void testGroupCreation() {
        returnToGroupPage(By.linkText("groups"));
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        returnToGroupPage(By.name("submit"));
        returnToGroupPage(By.linkText("group page"));
    }

    private void returnToGroupPage(By group_page) {
        submitGroupCreation(group_page);
    }

    private void submitGroupCreation(By submit) {
        gotoGroupPage(submit);
    }

    private void fillGroupForm(GroupData groupData) {
        login("group_name", "group_header", By.name("group_footer"), groupData.name(), groupData.header());
        driver.findElement(By.name("group_footer")).sendKeys(groupData.footer());
    }

    private void initGroupCreation() {
        returnToGroupPage(By.name("new"));
    }

    private void gotoGroupPage(By groups) {
        driver.findElement(groups).click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}