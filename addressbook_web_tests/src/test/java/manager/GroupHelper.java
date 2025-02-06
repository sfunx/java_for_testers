package manager;

import model.GroupData;
import org.openqa.selenium.By;

public class GroupHelper {
    private final ApplicationManager app;

    public GroupHelper(ApplicationManager app) {
        this.app = app;
    }

    protected void openGroupsPage() {
        if (!app.isElementPresent(By.name("new"))) {
            app.driver.findElement(By.linkText("groups")).click();
        }
    }

    public boolean isGroupPresent() {
        openGroupsPage();
        return app.isElementPresent(By.name("selected[]"));
    }

    public void createGroup(GroupData groupData) {
        openGroupsPage();
        app.driver.findElement(By.name("new")).click();
        app.driver.findElement(By.name("group_name")).click();
        app.driver.findElement(By.name("group_name")).sendKeys(groupData.name());
        app.driver.findElement(By.name("group_header")).click();
        app.driver.findElement(By.name("group_header")).sendKeys(groupData.header());
        app.driver.findElement(By.name("group_footer")).click();
        app.driver.findElement(By.name("group_footer")).sendKeys(groupData.footer());
        app.driver.findElement(By.name("submit")).click();
        app.driver.findElement(By.linkText("group page")).click();
    }

    public void removeAGroup() {
        openGroupsPage();
        app.driver.findElement(By.name("selected[]")).click();
        app.driver.findElement(By.name("delete")).click();
        app.driver.findElement(By.linkText("group page")).click();
    }
}
