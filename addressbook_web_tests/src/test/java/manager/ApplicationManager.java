package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    protected WebDriver driver;
    private LoginHelper session; // session eto peremennaya. loginhelper will help to log in and log out (start session, exit session)
    private GroupHelper groups;
    public void init() {
        if (driver == null) {
            driver = new ChromeDriver();
            Runtime.getRuntime().addShutdownHook(new Thread(driver::quit)); // when java finishes working call function "quit" in the object that is inside "driver" variable
            driver.get("http://localhost/addressbook/index.php");
            driver.manage().window().setSize(new Dimension(1210, 773));
            session().login("admin", "secret");
        }
    }

    public LoginHelper session() {
        if (session == null) {
            session = new LoginHelper(this); // if session is already initialized we skip login and move to return session
        }
        return session;
    }

    public GroupHelper groups() {
        if (groups == null) {
            groups = new GroupHelper(this);
        }
        return groups;
    }

    protected boolean isElementPresent(By Locator) {
        try {
            driver.findElement(Locator);
            return true;

        } catch (NoSuchElementException exception) {
            return false;
        }
    }

}
