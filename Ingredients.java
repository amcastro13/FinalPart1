/**
 * 
 */
package inNOut.project;

/**
 * @author firer
 *
 */
public class Ingredients {

	private boolean isAvailable;
	private int numOfIngredients;
	
	/**
	 * @return the numOfIngredients
	 */
	public int getNumOfIngredients() {
		return numOfIngredients;
	}

	/**
	 * @param numOfIngredients the numOfIngredients to set
	 */
	public void setNumOfIngredients(int numOfIngredients) {
		this.numOfIngredients = numOfIngredients;
	}

	public Ingredients(boolean available) {
		available = isAvailable;
	}

	/**
	 * @return the isAvailable
	 */
	public boolean isAvailable() {
		return isAvailable;
	}

	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
