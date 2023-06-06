import java.util.ArrayList;

public class Cart {
    static ArrayList<String> items = new ArrayList<String>();
    static ArrayList<Integer> prices = new ArrayList<Integer>();

    public void cart(String product, int price){

        items.add(product);
        prices.add(price);
        System.out.println(product+" "+price+" Added Successfully...");
        System.out.println("------------------------------------------------");
    }
    private int showTotal(){
        int Total = 0;
        for (int i = 0; i < prices.size(); i++) {
            Total+=prices.get(i);
        }
        return Total;
    }
    public void showCart(){
        System.out.println("_____CART_____");
//        System.out.println(items.get(0));
        System.out.println(items);
        System.out.println("Total = Rs "+showTotal());
        System.out.println("----------------------");

    }

    public void PlaceOrder(){
        System.out.println("_____Summery_____");
        for (int i = 0; i < prices.size(); i++) {
            System.out.println(items.get(i)+" - "+prices.get(i));
        }
        System.out.println("______________________");
        System.out.println("Total = Rs "+showTotal());
        System.out.println("______________________");
        System.out.println("----------------------");
        System.out.println("Thank you Come Again !....");
        System.out.println("**************************");
        System.exit(0);
    }
}
