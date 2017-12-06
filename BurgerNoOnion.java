package inNOut.project;

public class BurgerNoOnion extends Burger {

	private ADTListInterface<Ingredients> burgerNoOnionList = getIngredientList();
	
	public BurgerNoOnion(boolean isAvailable) {
		super(isAvailable);
		burgerNoOnionList.remove(2);
		// TODO Auto-generated constructor stub
		
	}

}
