/**
 * 
 */
package inNOut.project;

import java.util.Random;

/**
 * @author firer
 *
 */
public class Customer {

	private boolean foodOrdered;
	private int customerNumber;
	private Random randomNum = new Random();
	/**
	 * @return the foodOrdered
	 */
	public boolean getFoodOrdered() {
		return foodOrdered;
	}
	/**
	 * @return the customerNumber
	 */
	public int getCustomerNumber() {
		return customerNumber;
	}
	/**
	 * @param foodOrdered the foodOrdered to set
	 */
	public void setFoodOrdered(boolean foodOrdered) {
		this.foodOrdered = foodOrdered;
	}
	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	public Customer(boolean didOrder, int customer) {
		this.foodOrdered = getFoodOrdered();
		this.customerNumber = getCustomerNumber();
	}
	
	public int orderNumber() {
		int itemNumber = 0;
		itemNumber = randomNum.nextInt((6 - 1) + 1) + 1;
		return itemNumber;
		
	}
}
