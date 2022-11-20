package ru.stqa.pft.addressbook.tests.AddressTests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.tests.TestBase;

public class AddressDeletionTests extends TestBase {

    @Test
    public void testAddressDeletion() {
        app.getNavigationHelper().gotoHomePage();
        app.getGroupAndAddressHelper().selectAddress();
        app.getGroupAndAddressHelper().deleteSelectedAddress();
        app.getNavigationHelper().gotoHomePage();
    }
}
