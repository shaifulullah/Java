package com.company;

/**
 * Created by Shaiful on 2017-03-01.
 */
public class Contacts {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacts createContacts(String name, String phoneNumber){
        return new Contacts(name,phoneNumber);
    }
}
