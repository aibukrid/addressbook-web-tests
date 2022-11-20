package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.AddressData;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupAndAddressHelper extends HelperBase {

    public GroupAndAddressHelper(WebDriver driver) {
        super(driver);
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void returnToGroupPage() {
        click(By.xpath("//a[@href='group.php']"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void initGroupModification() {
        click(By.xpath("//input[@value='Edit group']"));
    }

    public void submitGroupModification() {
        click(By.xpath("//input[@value='Update']"));
    }

    public void initAddressCreation() {
        click(By.xpath("//a[@href='edit.php']"));
    }

    public void fillAddressForm(AddressData addressData) {
        type(By.name("firstname"), addressData.getFirst());
        type(By.name("middlename"), addressData.getMiddle());
        type(By.name("lastname"), addressData.getLast());
        type(By.name("nickname"), addressData.getNick());
        type(By.name("title"), addressData.getTitle());
        type(By.name("company"), addressData.getCompany());
        type(By.name("address"), addressData.getAddress());
        type(By.name("home"), addressData.getHome());
        type(By.name("mobile"), addressData.getMobile());
        type(By.name("work"), addressData.getWork());
        type(By.name("fax"), addressData.getFax());
        type(By.name("email"), addressData.getEmail());
        type(By.name("email2"), addressData.getEmail2());
        type(By.name("email3"), addressData.getEmail3());
        type(By.name("homepage"), addressData.getHomepage());
        type(By.name("address2"), addressData.getSecondAddress());
        type(By.name("phone2"), addressData.getSecondHome());
        type(By.name("notes"), addressData.getNotes());
    }

    public void submitAddressCreation() {
        click(By.xpath("//input[@value='Enter']"));
    }

}