package crust;
import menu.MenuItems;
public abstract class PizzaCrust implements  MenuItems {
    public abstract String toString(); 
    protected String ingredient;

    // get + set ingredient from after choose crust
    public PizzaCrust() {
        this.ingredient="";
    }
    
    // print output
    public String toNiceString() {
        return "Crust: " + this.toString() + "(" + this.ingredient + ")" + " $" + this.getPrice();
    }
    public String getIngredient() {
        return this.ingredient;
    }
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
    // return empty if crust is NOT cauliflower
    public String checkIntegrity() {
		return "";
	}
    @Override
    public Double getPrice() {
        return 1.5;
    }
 
}