import static java.lang.Integer.parseInt;

public class Pizzas {
    Cart cart = new Cart();
    String[][] NonVegPizza = {
            {"Cheese & BBQ Pizza", "1000"},
            {"BBQ Pizza", "1200"},
            {"Tandoori Pizza", "1500"},
            {"Black Chicken Pizza", "1700"},
    };
    String[][] VegPizza = {
            {"Onion Pizza", "800"},
            {"Garlic Pizza", "900"},
            {"Soya Pizza", "1100"},
            {"Mushroom Pizza", "1300"},

    };

    public void ShowVegPizza(){
        System.out.println("Veg Pizza Menu");
        System.out.println("------------------");
        int num = 1;
        for (String[] strings : VegPizza) {

            System.out.println(num+") " + strings[0] +" :- Rs "+ strings[1]);
            num++;
        }
        System.out.println();
    }
    public void ShowNonVegPizza(){
        System.out.println("Non Veg Pizza Menu");
        System.out.println("------------------");
        int num = 1;

        for (String[] strings : NonVegPizza) {
            System.out.println(num+") " +strings[0] +" :- Rs "+ strings[1]);
            num++;
        }
        System.out.println();
    }
    public void addVegPizzaToCart(int productNumber){
        cart.cart(VegPizza[productNumber-1][0],parseInt(VegPizza[productNumber-1][1]));
    }
    public void addNonVegPizzaToCart(int productNumber){
        cart.cart(NonVegPizza[productNumber-1][0],parseInt(NonVegPizza[productNumber-1][1]));
    }
}