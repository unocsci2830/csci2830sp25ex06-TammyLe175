package topping;
import menu.MenuItems;
public abstract class PizzaTopping implements MenuItems {
    public abstract String toString();
    public String toNiceString() {
        return this.toString() + " $" + this.getPrice();
    }
    @Override
    public Double getPrice() {
        return 1.0;
    }
    
    

}
