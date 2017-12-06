/**
 * 
 */
package inNOut.project;

/**
 * @author firer
 *
 */
public class Tomato extends Ingredients {

	private int expirationDate;
	
	/**
	 * @return the expirationDate
	 */
	public int getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Tomato(boolean available) {
		super(available);
		this.expirationDate = getExpirationDate();
		// TODO Auto-generated constructor stub
	}


}
