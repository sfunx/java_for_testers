package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupDeletionTests extends TestBase {
    @Test
    public void canDeleteAGroup() {
        app.openGroupsPage();
        if (!app.isGroupPresent()) {
            app.createGroup(new GroupData("new group1", "name header1", "name footer1"));
        }
        app.removeAGroup();
    }
}
