package ru.stqa.pft.addressbook.model;

public class AddressData {

    private final String first;
    private final String middle;
    private final String last;
    private final String nick;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String mobile;
    private final String work;
    private final String fax;
    private final String email;
    private final String email2;
    private final String email3;
    private final String homepage;
    private final String secondAddress;
    private final String secondHome;
    private final String notes;

    public AddressData(String first, String middle, String last, String nick, String title, String company,
                       String address, String home, String mobile, String work, String fax, String email,
                       String email2, String email3, String homepage, String secondAddress, String secondHome,
                       String notes) {
        this.first = first;
        this.middle = middle;
        this.last = last;
        this.nick = nick;
        this.title = title;
        this.company = company;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.work = work;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.secondAddress = secondAddress;
        this.secondHome = secondHome;
        this.notes = notes;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String getNick() {
        return nick;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getSecondAddress() {
        return secondAddress;
    }

    public String getSecondHome() {
        return secondHome;
    }

    public String getNotes() {
        return notes;
    }

}