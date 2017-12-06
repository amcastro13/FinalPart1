package inNOut.project;

public class CheeseBurger extends Burger{

	private ADTListInterface<Ingredients> ingredientListCheese = getIngredientList();
	private Cheese cheese;
	
	public CheeseBurger(boolean isAvailable) {
		super(isAvailable);
		ingredientListCheese.add(cheese);
		// TODO Auto-generated constructor stub
	}

}
