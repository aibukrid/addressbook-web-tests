package ru.stqa.pft.addressbook.tests.AddressTests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddressData;
import ru.stqa.pft.addressbook.tests.TestBase;

public class AddressModificationTests extends TestBase {

    @Test
    public void testAddressModification () {
        app.getNavigationHelper().gotoHomePage();
        app.getGroupAndAddressHelper().selectAddress();
        app.getGroupAndAddressHelper().initAddressModification();
        app.getGroupAndAddressHelper().fillAddressForm(new AddressData("modadd1", "modadd2", "modadd3",
                "modadd4", "modadd5", "modadd6", "modadd7", "modadd8", "modadd9",
                "modadd10", "modadd11", "modadd12", "modadd13", "modadd14",
                "modadd15", "modadd16", "modadd17", "modadd18"));
        app.getGroupAndAddressHelper().submitAddressModification();
        app.getNavigationHelper().gotoHomePage();
    }
}