import org.junit.jupiter.api.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void canCreateGroup() {
        openGroupsPage();
        createGroup("group name", "group header", "group footer");

    }

    @Test
    public void canCreateGroupWithEmptyName() {
        openGroupsPage();
        createGroup("", "", "");


    }

}

