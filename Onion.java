/**
 * 
 */
package inNOut.project;

/**
 * @author firer
 *
 */
public class Onion extends Ingredients {

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

	public Onion(boolean available) {
		super(available);
		this.expirationDate = getExpirationDate();
		// TODO Auto-generated constructor stub
	}

	

}
