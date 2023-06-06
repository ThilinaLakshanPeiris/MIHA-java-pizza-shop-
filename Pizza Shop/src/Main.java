import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Pizzas pizza = new Pizzas();
        Beverages drink = new Beverages();
        Cart cart = new Cart();
        Scanner Sc = new Scanner(System.in);

//        pizza.ShowVegPizza();
//        System.out.println("Enter Pizza Number That You Want To Order :- ");
//        int Veg_piz_num = Sc.nextInt();
//
//
//        pizza.ShowNonVegPizza();
//        System.out.println("Enter Pizza Number That You Want To Order :- ");
//        int Non_Veg_piz_num = Sc.nextInt();
        boolean run = true;
        while (run) {
            System.out.println("""
                    Pizza or Beverages :\s
                    Enter 1 For Pizza
                    Enter 2 For Beverages
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
                        pizza.ShowVegPizza();
                        System.out.print("Enter Pizza Number That You Want To Order :- ");
                        int Veg_pizza_num = Sc.nextInt();
                        pizza.addVegPizzaToCart(Veg_pizza_num);

                    }
                    else if (PizzaType == 2) {
                        pizza.ShowNonVegPizza();
                        System.out.print("Enter Pizza Number That You Want To Order :- ");
                        int Non_Veg_pizza_num = Sc.nextInt();
                        pizza.addNonVegPizzaToCart(Non_Veg_pizza_num);
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
                            cart.showCart();
                        }
                        else if (choice == 3) {
                            cart.PlaceOrder();
                        }
                    }

                }
            }
            else if (FoodType == 2) {


                int DrinkType = Sc.nextInt();
                boolean pizzaRun = true;
                boolean pizzaOk = true;
                while (pizzaRun ){
                    System.out.print("""
                            Cool Drinks or Hot Drinks :\s
                            Enter 1 For Hot Drinks
                            Enter 2 For Cool Drinks
                            Press To Main Menu :- 0"""
                    );

                    int DrinkType = Sc.nextInt();
                    if(DrinkType == 1){
                        pizza.ShowVegPizza();
                        System.out.print("Enter Pizza Number That You Want To Order :- ");
                        int Veg_pizza_num = Sc.nextInt();
                        pizza.addVegPizzaToCart(Veg_pizza_num);

                    }
                    else if (DrinkType == 2) {
                        pizza.ShowNonVegPizza();
                        System.out.print("Enter Pizza Number That You Want To Order :- ");
                        int Non_Veg_pizza_num = Sc.nextInt();
                        pizza.addNonVegPizzaToCart(Non_Veg_pizza_num);
                    }
                    else if (DrinkType == 0) {
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
                            cart.showCart();
                        }
                        else if (choice == 3) {
                            cart.PlaceOrder();
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
            }
        }

        System.out.print("Order Type : \n" +
                "Enter 1 For Delivery Orders\n" +
                "Enter 2 For Pick-Up Orders");
        int OrderType = Sc.nextInt();

    }
}