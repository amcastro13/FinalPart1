/**
 * 
 */
package inNOut.project;

/**
 * @author firer
 *
 */
public class Patty extends Ingredients {

	private int expirationDate;
	
	public Patty(boolean available) {
		super(available);
		this.expirationDate = getExpirationDate();
		// TODO Auto-generated constructor stub
	}

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

	

}
