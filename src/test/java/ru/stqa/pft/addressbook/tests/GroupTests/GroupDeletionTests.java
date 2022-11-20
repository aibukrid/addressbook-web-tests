package ru.stqa.pft.addressbook.tests.GroupTests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupAndAddressHelper().selectGroup();
        app.getGroupAndAddressHelper().deleteSelectedGroups();
        app.getGroupAndAddressHelper().returnToGroupPage();
    }

}