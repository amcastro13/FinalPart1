package inNOut.project;

public class VeganWrapBurger extends Burger {

	private ADTListInterface<Ingredients> veganWrapBurger = getIngredientList();
	
	private Lettuce lettuce;
	public VeganWrapBurger(boolean isAvailable) {
		super(isAvailable);
		// TODO Auto-generated constructor stub
		veganWrapBurger.add(lettuce);
		veganWrapBurger.remove(1);
		
	}

}
