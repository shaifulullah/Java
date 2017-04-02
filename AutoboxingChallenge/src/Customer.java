import java.util.ArrayList;

public class Customer {
	
	private String name;
	private ArrayList<Double> transctions;
	
	public Customer(String name, double initialAmount) {
		super();
		this.name = name;
		this.transctions = new ArrayList<Double>();
		addTransection(initialAmount);
	}

	public void addTransection(double amount) {
		this.transctions.add(amount);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransctions() {
		return transctions;
	}
	
}
