import static java.lang.Integer.parseInt;

public class Beverages {
        Cart cart = new Cart();
        String[][] HotDrinks = {
                {"Tea", "1000"},
                {"Coffee", "1200"},
                {"Nescafe", "1500"},
                {"NesTea", "1700"},
        };
        String[][] CoolDrinks = {
                {"CocaCola", "800"},
                {"Sprite", "900"},
                {"Pepsi", "1100"},
                {"Fanta", "1300"},

        };

        public void ShowVegPizza(){
            System.out.println("Hot Drinks Menu");
            System.out.println("------------------");
            int num = 1;
            for (String[] strings : HotDrinks) {

                System.out.println(num+") " + strings[0] +" :- Rs "+ strings[1]);
                num++;
            }
            System.out.println();
        }
        public void ShowNonVegPizza(){
            System.out.println("Non Cool Drinks Menu");
            System.out.println("------------------");
            int num = 1;

            for (String[] strings : CoolDrinks) {
                System.out.println(num+") " +strings[0] +" :- Rs "+ strings[1]);
                num++;
            }
            System.out.println();
        }
        public void addHotDrinksToCart(int productNumber){
            cart.cart(HotDrinks[productNumber-1][0],parseInt(HotDrinks[productNumber-1][1]));
        }
        public void addCoolDrinksToCart(int productNumber){
            cart.cart(CoolDrinks[productNumber-1][0],parseInt(CoolDrinks[productNumber-1][1]));
        }
    }

