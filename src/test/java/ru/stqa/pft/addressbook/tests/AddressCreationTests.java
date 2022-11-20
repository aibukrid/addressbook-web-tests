package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddressData;

public class AddressCreationTests extends TestBase {

    @Test
    public void testAddressCreation() {
        app.getGroupAndAddressHelper().initAddressCreation();
        app.getGroupAndAddressHelper().fillAddressForm(new AddressData("add1", "add2", "add3", "add4",
                "add5", "add6", "add7", "add8", "add9", "add10", "add11",
                "add12", "add13", "add14", "add15", "add16",
                "add17", "add18"));
        app.getGroupAndAddressHelper().submitAddressCreation();
        app.getNavigationHelper().gotoHomePage();
    }
}