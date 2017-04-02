package com.company;

public class VipCustomer{
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer() {

        this("Kiyaan","kiyaan@email.com",100000.500);
    }

    public VipCustomer(String email, double creditLimit) {

        this("Kiyaan",email,creditLimit);
    }

    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
