package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupAndAddressHelper().selectGroup();
        app.getGroupAndAddressHelper().initGroupModification();
        app.getGroupAndAddressHelper().fillGroupForm(new GroupData("mod1", "mod2", "mod3"));
        app.getGroupAndAddressHelper().submitGroupModification();
        app.getGroupAndAddressHelper().returnToGroupPage();
    }

}