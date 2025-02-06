package tests;

import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupDeletionTests extends TestBase {
    @Test
    public void canDeleteAGroup() {
        if (!app.groups().isGroupPresent()) {
            app.groups().createGroup(new GroupData("new group1", "name header1", "name footer1"));
        }
        app.groups().removeAGroup();
    }
}
