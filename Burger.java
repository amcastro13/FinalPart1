/**
 * 
 */
package inNOut.project;
/**
 * @author firer
 * The class burger will create a blue print for a burger with the ingredients:
 * Bun, patty, lettuce, tomato, onion
 */
public class Burger {

	private Cheese cheese;
	private Buns bun;
	private Lettuce lettuce;
	private Tomato tomato;
	private Onion onion;
	private Patty patty;
	private boolean available = true;
	private ADTListInterface<Ingredients> ingredientList = new ADTList<>(10);
	
	/**
	 * @return the patty
	 */
	public Patty getPatty() {
		return patty;
	}

	/**
	 * @return the ingredientList
	 */
	public ADTListInterface<Ingredients> getIngredientList() {
		return ingredientList;
	}

	/**
	 * @param patty the patty to set
	 */
	public void setPatty(Patty patty) {
		this.patty = patty;
	}

	/**
	 * @param ingredientList the ingredientList to set
	 */
	public void setIngredientList(ADTListInterface<Ingredients> ingredientList) {
		this.ingredientList = ingredientList;
	}

	public Burger(boolean isAvailable) {
		isAvailable = true;
		/**cheese = new Cheese(available);
		bun = new Buns(available);
		lettuce = new Lettuce(available);
		tomato = new Tomato(available);
		onion = new Onion(available);
	*/
		//ingredientList.add(cheese);
		ingredientList.add(bun);
		ingredientList.add(onion);
		ingredientList.add(tomato);
		ingredientList.add(patty);
		ingredientList.add(lettuce);
}

	/**
	 * @return the cheese
	 */
	public Cheese getCheese() {
		return cheese;
	}

	/**
	 * @return the bun
	 */
	public Buns getBun() {
		return bun;
	}

	/**
	 * @return the lettuce
	 */
	public Lettuce getLettuce() {
		return lettuce;
	}

	/**
	 * @return the tomato
	 */
	public Tomato getTomato() {
		return tomato;
	}

	/**
	 * @return the onion
	 */
	public Onion getOnion() {
		return onion;
	}

	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * @param cheese the cheese to set
	 */
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	/**
	 * @param bun the bun to set
	 */
	public void setBun(Buns bun) {
		this.bun = bun;
	}

	/**
	 * @param lettuce the lettuce to set
	 */
	public void setLettuce(Lettuce lettuce) {
		this.lettuce = lettuce;
	}

	/**
	 * @param tomato the tomato to set
	 */
	public void setTomato(Tomato tomato) {
		this.tomato = tomato;
	}

	/**
	 * @param onion the onion to set
	 */
	public void setOnion(Onion onion) {
		this.onion = onion;
	}

	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
}