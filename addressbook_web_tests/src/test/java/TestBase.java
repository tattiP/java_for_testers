import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    protected static WebDriver driver;

    protected static void removeGroup() {
      driver.findElement(By.name("selected[]")).click();
      driver.findElement(By.name("delete")).click();
      driver.findElement(By.linkText("groups")).click();
    }

    @BeforeEach
    public void setUp() {
        if (driver == null) {
            driver = new ChromeDriver();
            Runtime.getRuntime().addShutdownHook(new Thread(driver::quit)); // when java finishes working call function "quit" in the object that is inside "driver" variable
            driver.get("http://localhost/addressbook/index.php");
            driver.manage().window().setSize(new Dimension(1210, 773));
            driver.findElement(By.name("user")).sendKeys("admin");
            driver.findElement(By.name("pass")).sendKeys("secret");
            driver.findElement(By.xpath("//form[@id=\'LoginForm\']/input[3]")).click();
        }
    }
    protected boolean isElementPresent(By Locator) {
        try {
            driver.findElement(Locator);
            return true;

        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    protected void createGroup(String group_name, String group_header, String group_footer) {

        driver.findElement(By.name("new")).click();
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).sendKeys("Group");
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).sendKeys("group header");
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).sendKeys("group footer");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.linkText("group page")).click();
    }

    protected void openGroupsPage() {
        if (!isElementPresent(By.name("new"))) {
            driver.findElement(By.linkText("groups")).click();
        }
    }

    protected boolean isGroupPresent() {
      return isElementPresent(By.name("selected[]"));
    }
}