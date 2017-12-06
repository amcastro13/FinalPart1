package inNOut.project;

public class BurgerNoTomato extends Burger{

	private ADTListInterface<Ingredients> burgerNoTomatoList = getIngredientList();
	
	public BurgerNoTomato(boolean isAvailable) {
		super(isAvailable);
		// TODO Auto-generated constructor stub
		burgerNoTomatoList.remove(3);
	}

}
