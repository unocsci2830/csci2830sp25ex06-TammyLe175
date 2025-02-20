package crust;

public class ThickCrust extends PizzaCrust {
	private Boolean isDeepDish;
    @Override
	public String toString() {
		return "Thick Crust";
	}
	public boolean getDeepDish() {
		return this.isDeepDish;
	}
	public void setDeepDish(Boolean isDeeapDish) {
		this.isDeepDish = isDeeapDish;
	}
	@Override
	public String toNiceString() {
		return super.toNiceString() + (this.isDeepDish ? "(Deep Dish)" : " NO Deep Dish");
	}
	@Override
	public String checkIntegrity() {
		return this.ingredient.equalsIgnoreCase("Cauliflower")? "Handle carefully: crust might fall apart" : super.checkIntegrity();
	}
}