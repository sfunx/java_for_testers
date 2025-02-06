package manager;

import org.openqa.selenium.By;

public class LoginHelper {
    private final ApplicationManager app;

    public LoginHelper(ApplicationManager app) {
        this.app = app;
    }
    protected void login(String login, String password) {
        app.driver.findElement(By.name("user")).sendKeys(login);
        app.driver.findElement(By.name("pass")).sendKeys(password);
        app.driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
    }
}
