package manager;

import org.openqa.selenium.By;

public class LoginHelper extends HelperBase {
    public LoginHelper(ApplicationManager app) {
        super(app);
    }
    protected void login(String user, String pass) {
        type(By.name("user"), user);
        type(By.name("pass"), pass);
        click(By.xpath("//input[@value=\'Login\']"));
    }
}
