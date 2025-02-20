package sauce;
import menu.MenuItems;
public abstract class PizzaSauce implements MenuItems {
    public abstract String toString();
    
    public String toNiceString() {
        return "Sauce: " + this.toString() + " $" + this.getPrice();
    }

    @Override
    public Double getPrice() {
        return 1.5;
    }
    
    
}