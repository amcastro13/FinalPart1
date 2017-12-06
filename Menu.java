/**
 * 
 */
package inNOut.project;

/**
 * @author firer
 *
 */
public class Menu {

	private ADTListInterface<Burger> burgerList = new ADTList<>();
	private Burger burger;
	private CheeseBurger cheeseburger;
	private CheeseBurgerNoOnion cheeseBurgerNoOnion;
	private VeganWrapBurger veganWrapBurger;
	private BurgerNoTomato burgerNoTomato;
	private BurgerNoOnion burgerNoOnion;

	
	public Menu() {
		burgerList.add(burger);
		burgerList.add(cheeseburger);
		burgerList.add(cheeseBurgerNoOnion);
		burgerList.add(veganWrapBurger);
		burgerList.add(burgerNoTomato);
		burgerList.add(burgerNoOnion);
	}
}
