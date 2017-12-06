package inNOut.project;

public class CheeseBurgerNoOnion extends Burger {

	private ADTListInterface<Ingredients> cheeseBurgerNoOnionList = getIngredientList();

	private Cheese cheese;
	
	public CheeseBurgerNoOnion(boolean isAvailable) {
		super(isAvailable);
		cheeseBurgerNoOnionList.add(cheese);
		cheeseBurgerNoOnionList.remove(2);
		// TODO Auto-generated constructor stub
	}

}
