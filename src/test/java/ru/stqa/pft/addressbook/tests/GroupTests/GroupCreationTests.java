package ru.stqa.pft.addressbook.tests.GroupTests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupAndAddressHelper().initGroupCreation();
        app.getGroupAndAddressHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupAndAddressHelper().submitGroupCreation();
        app.getGroupAndAddressHelper().returnToGroupPage();
    }

}