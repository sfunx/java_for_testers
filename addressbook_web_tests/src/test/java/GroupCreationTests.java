import model.GroupData;
import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void canCreateAGroup() {
        openGroupsPage();
        createGroup(new GroupData("new group1", "name header1", "name footer1"));
    }

    @Test
    public void canCreateGroupWithEmptyName() {
        openGroupsPage();
        createGroup(new GroupData());
    }

    @Test
    public void canCreateGroupWithNameOnly() {
        openGroupsPage();
        createGroup(new GroupData().withName("some name"));
    }
}
