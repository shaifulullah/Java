// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("Royal Bank of Canada");
		
		bank.addBruncehes("Downtown");
		bank.addCustomer("Shaiful", "Downtown", 200.00);
		bank.addCustomer("Kiyaan", "Downtown", 4000.00);
		bank.addCustomer("Happy", "Downtown", 18000.20);

		bank.addBruncehes("North York");
		bank.addCustomer("Happy", "North York", 1000.00);
		
		bank.addCustomerTransection("Shaiful", "Downtown", 300.00);
		bank.addCustomerTransection("Kiyaan", "Downtown", 3000.44);
		bank.addCustomerTransection("Happy", "Downtown", 500.10);
		bank.addCustomerTransection("Happy", "North York", 4000.00);
		
		bank.listOfCustomer("Downtown", true);
		bank.listOfCustomer("North York", false);
	}

}
