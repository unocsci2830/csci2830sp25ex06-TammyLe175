
import crust.PizzaCrust;
import java.lang.reflect.Array;
import java.util.ArrayList;
import sauce.PizzaSauce;
import topping.PizzaTopping;
import java.util.List;
import menu.MenuItems;

public class Pizza implements MenuItems {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private ArrayList<PizzaTopping> toppingList;
    private ArrayList<MenuItems> selectionList;

    public Pizza() {
        this.crust = null;
        this.sauce = null;
        this.toppingList = new ArrayList<PizzaTopping>();
        this.selectionList = new ArrayList<MenuItems>();

        
    }
    public PizzaCrust getCrust() {
        return this.crust;
    }
    public void setCrust(PizzaCrust crust) {
        this.crust = crust;
        this.selectionList.add(crust);
    }
    
    public PizzaSauce getSauce() {
        return this.sauce;
    }
    public void setSauce(PizzaSauce sauce) {
        this.sauce = sauce;
        this.selectionList.add(sauce);
    }

    public ArrayList<PizzaTopping> getTopping() {
        return this.toppingList;
    }
    public void setTopping(ArrayList<PizzaTopping> toppings) {
		this.toppingList = toppings;
	}
    /**
	 * addTopping appends a new topping to the list of toppings.
	 * @param topping is any valid PizzaTopping
	 */
    public void addTopping(PizzaTopping topping) {
        this.toppingList.add(topping);
        this.selectionList.add(topping);
    }

    public void displayPizza(){
        System.out.println("Here is the final pizza: ");
        System.out.println(this.crust.toNiceString());
        System.out.println(this.sauce.toNiceString());
        System.out.println("List of toppings you chosen: ");
        for (PizzaTopping t : this.toppingList) {
            System.out.println(t.toNiceString());
        }
        double sum = 0.0;
        for(MenuItems m : this.selectionList) {
            sum += m.getPrice();
        }
        System.out.println("\nTotal Prices: $" + sum);
        
    }
    @Override
    public Double getPrice() {
        Double totalPrice = 0.0;
        totalPrice += this.crust.getPrice();
        totalPrice += this.sauce.getPrice();
        for (PizzaTopping m : this.toppingList) {
            totalPrice += getPrice();
        }
        return totalPrice;
    }
}
    