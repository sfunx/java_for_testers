package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void canCreateAGroup() {
        app.openGroupsPage();
        app.createGroup(new GroupData("new group1", "name header1", "name footer1"));
    }

    @Test
    public void canCreateGroupWithEmptyName() {
        app.openGroupsPage();
        app.createGroup(new GroupData());
    }

    @Test
    public void canCreateGroupWithNameOnly() {
        app.openGroupsPage();
        app.createGroup(new GroupData().withName("some name"));
    }
}
