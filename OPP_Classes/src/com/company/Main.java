package com.company;

public class Main {

    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.setModel("abcMOdel");

        System.out.println("your model is " + newCar.getModel());

        System.out.println("*********************");

        Bank bankClass =  new Bank();
        bankClass.deposit(200);

        bankClass.withdraw(700);
        System.out.println("*******************************");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Kiyaan@email.com",2000000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Kiaan Ullah", "kaysan@email.com",2222222);
        System.out.println(person3.getName());



// Bank bankClass = new Bank();
//        bankClass.setAccountBalance(200.20);
//        bankClass.setAccountNumber(1234567);
//        bankClass.setCustomerEmail("customer@email.com");
//        bankClass.setCustomerName("Rahim Uddin");
//        bankClass.setPhoneNumber(171108);
//
//        System.out.println(
//                "Customer Name: " + bankClass.getCustomerName() + "\n" +
//                "Customer Account Number: " + bankClass.getAccountNumber() + "\n" +
//                "Customer Phone Number: " + bankClass.getPhoneNumber() + "\n" +
//                "Customer email Address: " + bankClass.getCustomerEmail() + "\n" +
//                "Customer Account Balance: " + bankClass.getAccountBalance());
//
//        double balance = bankClass.addDeposit(200);
//        System.out.println("after deposit Your new balance is now: "+ balance);
//
//        double withdraw =  bankClass.withdrawDeposit(500.2);
//        double finalBalance = balance - withdraw;
//        if (finalBalance<0)
//            System.out.println("YOU ARE NOT ALLOWED TO WITHDRAW A FUND" +
//                    "MORE THAN "+balance);
//        else
//        System.out.println("Your final banalnce is now: "+(balance-withdraw));

    }
}
