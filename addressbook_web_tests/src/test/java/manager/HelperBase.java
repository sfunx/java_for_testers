package manager;

import org.openqa.selenium.By;

public class HelperBase {
    protected final ApplicationManager app;

    public HelperBase(ApplicationManager app) {
        this.app = app;
    }

    protected void type(By loc, String text) {
        click(loc);
        app.driver.findElement(loc).clear();
        app.driver.findElement(loc).sendKeys(text);
    }

    protected void click(By loc) {
        app.driver.findElement(loc).click();
    }
}
