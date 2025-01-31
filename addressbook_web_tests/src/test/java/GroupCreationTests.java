import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void canCreateAGroup() {
        openGroupsPage();
        createGroup("new group1", "group header1", "group footer1");
    }

    @Test
    public void canCreateGroupWithEmptyName() {
        openGroupsPage();
        createGroup("", "", "");
    }
}
