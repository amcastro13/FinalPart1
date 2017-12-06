package inNOut.project;

public class Food {

	private StackInterface<Ingredients> ingredientsList = new Stack<>(10);
	private Buns bun;
	private Cheese cheese;
	private Lettuce lettuce;
	private Onion onion;
	private Patty patty;
	private Tomato tomato;
	
	public Food() {
		ingredientsList.push(bun);
		ingredientsList.push(cheese);
		ingredientsList.push(lettuce);
		ingredientsList.push(onion);
		ingredientsList.push(patty);
		ingredientsList.push(tomato);
		
	}
}
