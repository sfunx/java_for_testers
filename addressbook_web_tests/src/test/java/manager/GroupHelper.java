package manager;

import model.GroupData;
import org.openqa.selenium.By;

public class GroupHelper extends HelperBase {

    public GroupHelper(ApplicationManager app) {
        super(app);
    }

    protected void openGroupsPage() {
        if (!app.isElementPresent(By.name("new"))) {
            click(By.linkText("groups"));
        }
    }

    public boolean isGroupPresent() {
        openGroupsPage();
        return app.isElementPresent(By.name("selected[]"));
    }

    public void createGroup(GroupData group) {
        openGroupsPage();
        initGroup("new");
        fillGroupForm(group);
        submitGroup("submit");
        returnToGroupsPage();
    }

    public void removeAGroup() {
        openGroupsPage();
        selectGroup();
        submitGroup("delete");
        returnToGroupsPage();
    }

    public void modifyGroup(GroupData group) {
        openGroupsPage();
        selectGroup();
        initGroup("edit");
        fillGroupForm(group);
        submitGroup("update");
        returnToGroupsPage();
    }

    private void returnToGroupsPage() {
        click(By.linkText("group page"));
    }

    private void submitGroup(String action) {
        click(By.name(action));
    }

    private void fillGroupForm(GroupData group) {
        type(By.name("group_name"), group.name());
        type(By.name("group_header"), group.header());
        type(By.name("group_footer"), group.footer());
    }

    private void initGroup(String action) {
        click(By.name(action));
    }

    private void selectGroup() {
        click(By.name("selected[]"));
    }
}
