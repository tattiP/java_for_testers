import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GroupRemovalTest {
  private WebDriver driver;

  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();

  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }


  @Test
  public void test() {
    driver.get("http://localhost/addressbook/index.php");
    driver.manage().window().setSize(new Dimension(1210, 773));
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("//form[@id=\'LoginForm\']/input[3]")).click();
    driver.findElement(By.linkText("groups")).click();
    driver.findElement(By.xpath("(//input[@name=\'selected[]\'])[13]")).click();
    driver.findElement(By.xpath("(//input[@name=\'delete\'])[2]")).click();
    driver.findElement(By.linkText("groups")).click();
    driver.findElement(By.linkText("Logout")).click();
  }
}
