import crust.ThickCrust;
import crust.ThinCrust;
import java.util.Scanner;
import sauce.Alfredo;
import sauce.TomatoSauce;
import topping.cheese.CheddarTopping;
import topping.cheese.MozzarellaTopping;
import topping.cheese.Provolone;
import topping.cheese.Ricotta;
import topping.meat.BeefTopping;
import topping.meat.ChickenTopping;
import topping.meat.PepperoniTopping;
import topping.meat.PorkTopping;
import topping.veggies.Bellpepper;
import topping.veggies.MushroomTopping;
import topping.veggies.Onion;
import topping.veggies.Pineapple;


public class PizzaMain {
    private Pizza pizza;
    private Scanner input;
    public PizzaMain() {
        pizza = new Pizza();
        input = new Scanner(System.in);
    }
    private void inputCrust() {
      Boolean validChoice = false;
      Integer crustChoice = 0;
      Integer ingredientChoice = 0;
      String deepDishChoice;
      ThickCrust thickcrust = null;
      
      while(!validChoice) {
        System.out.println("what kind of crust would you like: ");
        System.out.println("1 - Thin crust");
        System.out.println("2 - Thick crust");
        System.out.println("Your Choice: ");
        crustChoice = input.nextInt();
        switch (crustChoice) {
            case 1:
                pizza.setCrust(new ThinCrust());
                validChoice = true;
                break;
            case 2:
                thickcrust = new ThickCrust();
                pizza.setCrust(thickcrust);
                validChoice = true;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
      }
        validChoice = false;
        while(!validChoice) {
            System.out.println("what kind of ingredient in crust: ");
            System.out.println("1 - flour");
            System.out.println("2 - Cauliflower");
            System.out.println("Your choice: ");
            ingredientChoice = input.nextInt();
            switch (ingredientChoice) {
                case 1:
                    pizza.getCrust().setIngredient("Flour");
                    validChoice = true;
                    break;
                case 2:
                    pizza.getCrust().setIngredient("Cauliflower");
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
      }
      if(crustChoice==2) {
        validChoice = false;
        while(!validChoice) {
            System.out.println("Deep Dish (Y/N): ");
            deepDishChoice = input.next();
            switch (deepDishChoice) {
                case "Y":
                case "y":
                    thickcrust.setDeepDish(true);
                    validChoice = true;
                    break;
                case "N":
                case "n":
                    thickcrust.setDeepDish(false);
                    validChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice. please try again");
            }
        }
      }
    }
    private void inputSauce() {
      Boolean validChoice = false;
      Integer sauceChoice = 0;
      while(!validChoice) {
        System.out.println("what kind of sauce would you like: ");
        System.out.println("1 - Tomato Sauce");
        System.out.println("2 - Alfredo Sauce");
        System.out.println("Your Choice: ");
        sauceChoice = input.nextInt();
        switch (sauceChoice) {
            case 1:
                pizza.setSauce(new TomatoSauce());
                validChoice = true;
                break;
            case 2:
                pizza.setSauce(new Alfredo());
                validChoice = true;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
      }
    }
    private void inputTopping() {
        System.out.println("How many toppings? ");
        Integer numToppings = input.nextInt();
        for (Integer i = 0; i < numToppings; i++) {
            Boolean validChoice = false;
            System.out.println("1 - Beef");
            System.out.println("2 - Pepperoni");
            System.out.println("3 - Pork");
            System.out.println("4 - Chicken");
            System.out.println("5 - Cheddar");
            System.out.println("6 - Mozzarella");
            System.out.println("7 - Provolone");
            System.out.println("8 - Ricotta");
            System.out.println("9 - Mushrooms");
            System.out.println("10 - Onions");
            System.out.println("11 - Pineapple");
            System.out.println("12 - Bell pepper");
            System.out.println("Your choice: ");
            while(!validChoice) {
            Integer toppingChoice = input.nextInt();
                switch (toppingChoice) {
                    case 1:
                        pizza.addTopping(new BeefTopping());
                        validChoice = true;
                        break;
                    case 2:
                        pizza.addTopping(new PepperoniTopping());
                        validChoice = true;
                        break;
                    case 3:
                        pizza.addTopping(new PorkTopping());
                        validChoice = true;
                        break;
                    case 4:
                        pizza.addTopping(new ChickenTopping());
                        validChoice = true;
                        break;
                    case 5:
                        pizza.addTopping(new CheddarTopping());
                        validChoice = true;
                        break;
                    case 6:
                        pizza.addTopping(new MozzarellaTopping());
                        validChoice = true;
                        break;
                    case 7:
                        pizza.addTopping(new Provolone());
                        validChoice = true;
                        break;
                    case 8:
                        pizza.addTopping(new Ricotta());
                        validChoice = true;
                        break;
                    case 9:
                        pizza.addTopping(new MushroomTopping());
                        validChoice = true;
                        break;
                    case 10:
                        pizza.addTopping(new Onion());
                        validChoice = true;
                        break;
                    case 11:
                        pizza.addTopping(new Pineapple());
                        validChoice = true;
                        break;
                    case 12:
                        pizza.addTopping(new Bellpepper());
                        validChoice = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again");
                }
            }
        }
    }


    private void showPizza() {
      pizza.displayPizza();
      System.out.println(pizza.getCrust().checkIntegrity());
    }
    
    public void runMenu() {
      inputCrust();
      inputSauce();
      inputTopping();
      showPizza();
    }
    public static void main(String[] args) {
      PizzaMain pm = new PizzaMain();
      pm.runMenu();
      

    }


}
