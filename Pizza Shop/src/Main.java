import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Pizzas pizza = new Pizzas();
        Beverages drink = new Beverages();
        Cart cart = new Cart();
        Scanner Sc = new Scanner(System.in);
        boolean run = true;

        while (run) {

            try {
                System.out.println("""
                    Pizza or Beverages :\s 
                    Enter 1 For Pizza
                    Enter 2 For Beverage Bottles
                    To EXIT Press 0""");

                int FoodType = Sc.nextInt();

                if (FoodType == 1) {
                    boolean pizzaRun = true;
                    boolean pizzaOk = true;
                    while (pizzaRun ){
                        System.out.println("""
                            Veg Pizza or Non-Veg pizza :\s
                            Enter 1 For Veg Pizza
                            Enter 2 For Non-Veg pizza
                            Press To Main Menu :- 0"""
                        );

                            int PizzaType = Sc.nextInt();

                        if(PizzaType == 1){
                            try {
                                pizza.ShowVegPizza();
                                System.out.print("Enter Pizza Number That You Want To Order :- ");
                                int Veg_pizza_num = Sc.nextInt();
                                pizza.addVegPizzaToCart(Veg_pizza_num);
                            }catch (Exception e){
                                System.out.println("Please Enter Valid Veg Pizza Number !..");
                                break;
                            }
                        }
                        else if (PizzaType == 2) {
                            try {
                                pizza.ShowNonVegPizza();
                                System.out.print("Enter Pizza Number That You Want To Order :- ");
                                int Non_Veg_pizza_num = Sc.nextInt();
                                pizza.addNonVegPizzaToCart(Non_Veg_pizza_num);
                            }catch (Exception e){
                                System.out.println("Please Enter Valid Non Veg Pizza Number !..");
                                break;
                            }
                        }
                        else if (PizzaType == 0) {
                            break;
                        }
                        else {
                            System.out.println("Please Enter Valid Input");
                        }

                        while (pizzaOk){
                            System.out.println("Press To add More Pizza :- 1 \n" +
                                    "Press To see The Cart :- 2 \n" +
                                    "Press To Buy :- 3 \n" +
                                    "Press To Main Menu :- 0");

                            int choice = Sc.nextInt();
                            if (choice == 0 ){
                                pizzaOk = false;
                            } else if (choice == 1 ) {
                                break;
                            } else if (choice == 2) {
                                if(cart.showTotal() >= 5000){
                                    cart.DiscountShowCart();
                                }else {
                                    cart.showCart();
                                }

                            }
                            else if (choice == 3) {
                                System.out.println("Do you want to Buy More Pizza or Beverages.\n " +
                                        "press 1 to buy More\n " +
                                        "press 0 to Continue Payment");
                                int lastInput = Sc.nextInt();
                                if(lastInput == 1){
                                    break;
                                } else if (lastInput == 0) {

                                    if(cart.showTotal() >= 5000){
                                        cart.DiscountPlaceOrder();
                                    }else {
                                        cart.PlaceOrder();
                                    }

                                }else {
                                    System.out.println("please enter valid input...");

                                }

                            }
                        }

                    }
                }
                else if (FoodType == 2) {

                    boolean DrinkRun = true;
                    boolean DrinkOk = true;
                    while (DrinkRun ){
                        System.out.println("""
                            Cool Drinks or Hot Drinks :\s
                            Enter 1 For Hot Drinks
                            Enter 2 For Cool Drinks
                            Press To Main Menu :- 0"""
                        );

                        int DrinkType = Sc.nextInt();
                        if(DrinkType == 1){
                            try {
                                drink.ShowHotDrinks();
                                System.out.print("Enter Drink Number That You Want To Order :- ");
                                int Hot_Drink_num = Sc.nextInt();
                                drink.addHotDrinksToCart(Hot_Drink_num);
                            }catch (Exception e){
                                System.out.println("Please Enter Valid Hot Drink Number !..");
                                break;
                            }
                        }
                        else if (DrinkType == 2) {
                            try {
                                drink.ShowCoolDrinks();
                                System.out.print("Enter Drink Number That You Want To Order :- ");
                                int Cool_Drink_num = Sc.nextInt();
                                drink.addCoolDrinksToCart(Cool_Drink_num);
                            }catch (Exception e){
                                System.out.println("Please Enter Valid Cool Drink Number !..");
                                break;
                            }
                        }
                        else if (DrinkType == 0) {
                            break;
                        }
                        else {
                            System.out.println("Please Enter Valid Input");
                        }

                        while (DrinkOk){
                            System.out.println("Press To add More Drink :- 1 \n" +
                                    "Press To see The Cart :- 2 \n" +
                                    "Press To Buy :- 3 \n" +
                                    "Press To Main Menu :- 0");

                            int choice = Sc.nextInt();
                            if (choice == 0 ){
                                DrinkOk = false;
                            } else if (choice == 1 ) {
                                break;
                            } else if (choice == 2) {
                                if(cart.showTotal() >= 5000){
                                    cart.DiscountShowCart();
                                }else {
                                    cart.showCart();
                                }
                            }
                            else if (choice == 3) {
                                System.out.println("Do you want to Buy More Pizza or Beverages.\n " +
                                        "press 1 to buy More\n " +
                                        "press 0 to Continue Payment");
                                int lastInput = Sc.nextInt();
                                if(lastInput == 1){
                                    break;
                                } else if (lastInput == 0) {
                                    if(cart.showTotal() >= 5000){
                                        cart.DiscountPlaceOrder();
                                    }else {
                                        cart.PlaceOrder();
                                    }
                                }else {
                                    System.out.println("please enter valid input...");

                                }
                            }
                        }

                    }
                }
                else if (FoodType == 0) {
                    System.out.println("Thank you !....");
                    System.exit(0);
                }
                else {
                    System.out.println("Please Enter Valid Input...");
                    System.out.println();
                }
            }catch (Exception e){
                System.out.println("Invalid Input !");
                break;
            }
        }
    }
}
