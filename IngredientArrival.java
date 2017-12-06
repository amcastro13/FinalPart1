/**
 * 
 */
package inNOut.project;

import java.util.Random;

/**
 * @author firer
 * This will be a super class for all ingredients in the menu
 */
public class IngredientArrival {

	private boolean isAvailable = false;
	private Random randomDay = new Random();
	private int randomNum = randomDay.nextInt((6 - 3) + 1) + 3;
	
	
	
	/**
	 * @return the isAvailable
	 */
	public boolean isAvailable() {
		return isAvailable;
	}



	/**
	 * @return the randomDay
	 */
	public Random getRandomDay() {
		return randomDay;
	}



	/**
	 * @return the randomNum
	 */
	public int getRandomNum() {
		return randomNum;
	}



	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}



	/**
	 * @param randomDay the randomDay to set
	 */
	public void setRandomDay(Random randomDay) {
		this.randomDay = randomDay;
	}



	/**
	 * @param randomNum the randomNum to set
	 */
	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
	}



	public IngredientArrival(int arrivalDay) {
		arrivalDay = getRandomNum();
		
	}
}
