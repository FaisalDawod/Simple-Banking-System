package banking;

/**
 * Represents a customer of a bank.
 * @author FaisalDawod
 */
public class Customer {
	// Instance variables
	
	/**
	 * Name of customer.
	 */
	String name;
	
	/**
	 * Address of customer.
	 */
	String address;
	
	// Constructor
	/**
	 * Creates a customer with the given name
	 * @param name of customer
	 */
	public Customer(String name) {
		// Sets instance variable name to given name
		this.name = name;
	}
	
	// Methods
	/**
	 * Sets the address of customer to be given address 
	 * @param address for customer
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Returns customer's name
	 * @return name of the customer
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns customer's address
	 * @return address of the customer
	 */
	public String getAddress() {
		return this.address;
	}
}
