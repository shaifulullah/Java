package com.company;

public class Bank {
    private int _accountNumber;
    private double _accountBalance;
    private String _customerName;
    private String _customerEemail;
    private int _phoneNumber;

    public void deposit(double deposit){
        this._accountBalance += deposit;
        System.out.println("after deposit of "+deposit+
                "your balance is "+this._accountBalance);
    }

    public void withdraw (double withdrawal){
        if (this._accountBalance - withdrawal <=0 ){
            System.out.println("you can not withdraw more than "+this._accountBalance);
        }
        else{
            this._accountBalance -= withdrawal;
            System.out.println("after withdraw "+withdrawal+
                    "your new balance is "+this._accountBalance);
        }
    }


    public int get_accountNumber() {
        return _accountNumber;
    }

    public void set_accountNumber(int _accountNumber) {
        this._accountNumber = _accountNumber;
    }

    public double get_accountBalance() {
        return _accountBalance;
    }

    public void set_accountBalance(double _accountBalance) {
        this._accountBalance = _accountBalance;
    }

    public String get_customerName() {
        return _customerName;
    }

    public void set_customerName(String _customerName) {
        this._customerName = _customerName;
    }

    public String get_customerEemail() {
        return _customerEemail;
    }

    public void set_customerEemail(String _customerEemail) {
        this._customerEemail = _customerEemail;
    }

    public int get_phoneNumber() {
        return _phoneNumber;
    }

    public void set_phoneNumber(int _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }
















    //    private double _addDeposit;
//    private double _withdrawDeposit;
//
//    public void setAccountNumber(int accountNumber){
//        this._accountNumber = accountNumber;
//    }
//
//    public int getAccountNumber(){
//        return this._accountNumber;
//    }
//
//    public void setAccountBalance(double accountBalance){
//        this._accountBalance = accountBalance;
//    }
//
//    public double getAccountBalance(){
//        return this._accountBalance;
//    }
//
//    public void setCustomerName(String customerName){
//        this._customerName = customerName;
//    }
//
//    public String getCustomerName(){
//        return this._customerName;
//    }
//
//    public void setCustomerEmail(String customerEmail){
//        this._customerEemail = customerEmail;
//    }
//
//    public String getCustomerEmail(){
//        return this._customerEemail;
//    }
//
//    public void setPhoneNumber(int phoneNumber){
//        this._phoneNumber = phoneNumber;
//    }
//    public int getPhoneNumber(){
//        return this._phoneNumber;
//    }
//
//    public double addDeposit (double deposit){
//        this._addDeposit = deposit;
//        double newBalance = deposit+getAccountBalance();
//        //System.out.println("Your new banalce is now: " + newBalance);
//        return newBalance;
//    }
//
//    public double withdrawDeposit(double withdraw){
//        this._withdrawDeposit = withdraw;
//        return withdraw;
//}
}
