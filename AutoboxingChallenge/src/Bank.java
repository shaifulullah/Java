import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branchs;
	
	public Bank(String name) {
		super();
		this.name = name;
		this.branchs = new ArrayList<Branch>();
	}
	
	public boolean addBruncehes(String branchName) {
		if (findBranch(branchName) == null) {
			this.branchs.add(new Branch(branchName));
			return true;
		}
		return false;
	}
	
	public boolean addCustomer(String customerName, String branchName, double initialAmount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.newCustomer(customerName, initialAmount);
		}
		return false;
	}
	
	public boolean addCustomerTransection(String customerName, String branchName, double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addTransection(customerName, amount);
		}
		return false;
	}
	 
	private Branch findBranch(String branchName) {
		for(int i=0; i<branchs.size(); i++)
			if (this.branchs.get(i).getName().equals(branchName)) {
				return this.branchs.get(i);
			}
		return null;
	}
	
	public boolean listOfCustomer(String branchName, boolean showTransections) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Customer details for branch "+branch.getName());
			
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for(int i=0; i<branchCustomers.size(); i++){
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: "+branchCustomer.getName()+"["+(i+1)+"]");
				if (showTransections) {
					System.out.println("Transections:");
					ArrayList<Double> transections =  branchCustomer.getTransctions();
					for(int j=0; j<transections.size(); j++){
						System.out.println("["+(j+1)+"]"+" Amount"+transections.get(j));
					}
				}
			}
			return true;
		}else{
			return false;
		}
	}
}

