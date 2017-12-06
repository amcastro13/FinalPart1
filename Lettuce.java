package inNOut.project;

public class Lettuce extends Ingredients {

	private int lettuceAmount;
	private int expirationDate;
	
	public Lettuce(boolean available) {
		super(available);
		lettuceAmount = getLettuceAmount();
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
	/**
	 * @return the lettuceAmount
	 */
	public int getLettuceAmount() {
		return lettuceAmount;
	}
	/**
	 * @param lettuceAmount the lettuceAmount to set
	 */
	public void setLettuceAmount(int lettuceAmount) {
		this.lettuceAmount = lettuceAmount;
	}

	

}
