import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    Scanner Sca = new Scanner(System.in);
    static ArrayList<String> items = new ArrayList<String>();
    static ArrayList<Integer> prices = new ArrayList<Integer>();

    float discount;

    public void cart(String product, int price){

        items.add(product);
        prices.add(price);
        System.out.println(product+" "+price+" Added Successfully...");
        System.out.println("------------------------------------------------");
    }
    public int showTotal(){
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

    public void DiscountShowCart() {
        System.out.println("_____CART_____");
//        System.out.println(items.get(0));
        System.out.println(items);
        System.out.println("SubTotal = Rs " + showTotal());
        this.discount = showTotal()/10;
        System.out.println("10% Discount amount :- " + discount);
        System.out.println("______________________");
        System.out.println("Total amount :- " + (showTotal()-discount));
        System.out.println("----------------------");
        System.out.println("-------------------------------------------------------------------------");
    }
    public void PlaceOrder(){

        System.out.println("Order Type : \n" +
                "Enter 1 For Delivery Orders\n" +
                "Enter 2 For Pick-Up Orders");
        int OrderType = Sca.nextInt();
        if(OrderType == 1){
            if(items.size() > 5){
                System.out.println("delivery order, a maximum of five items can be included.");

            }else{
                System.out.print("Customer Name :- ");
                String Customer_name = Sca.nextLine();
                System.out.print("Customer Phone Number :- ");
                String Customer_Number = Sca.nextLine();
                System.out.print("Customer Address :- ");
                String Customer_address = Sca.nextLine();
                Customers customer = new Customers();
                customer.Name = Customer_name;
                customer.PhoneNum = Customer_Number;
                customer.Address = Customer_address;
                customer.Promo_msg = true;
                customer.GoldCustomers.add(customer);

                System.out.println("___________________ S U M M E R Y ___________________");
                for (int i = 0; i < prices.size(); i++) {
                    System.out.println(items.get(i)+" - "+prices.get(i));
                }
                System.out.println("______________________");
                System.out.println("Total = Rs "+showTotal());
                System.out.println("-_-_-_-_-_-_-_-_-_-_-_");
                System.out.println("Thank you Come Again !....");
//              System.out.println(customer.GoldCustomers.get(0);
                System.out.println("**************************");
                System.exit(0);
            }
        }
    }

    public void DiscountPlaceOrder(){

        System.out.println("Order Type : \n" +
                "Enter 1 For Delivery Orders\n" +
                "Enter 2 For Pick-Up Orders");
        int OrderType = Sca.nextInt();
        if(OrderType == 1){
            if(items.size() > 5){
                System.out.println("For delivery order, a maximum of five items can be included.");

            }else{
                System.out.print("Customer Name :- ");
                String Customer_name = Sca.nextLine();
                System.out.print("Customer Phone Number :- ");
                String Customer_Number = Sca.nextLine();
                System.out.print("Customer Address :- ");
                String Customer_address = Sca.nextLine();
                Customers customer = new Customers();
                customer.Name = Customer_name;
                customer.PhoneNum = Customer_Number;
                customer.Address = Customer_address;
                customer.Promo_msg = true;
                customer.GoldCustomers.add(customer);

                System.out.println("___________________ S U M M E R Y ___________________");
                for (int i = 0; i < prices.size(); i++) {
                    System.out.println(items.get(i)+" - "+prices.get(i));
                }
                System.out.println("____________________________________________________");
                System.out.println("SubTotal = Rs "+showTotal());
                System.out.println("10% Discount amount :- " + discount);
                System.out.println("______________________");
                System.out.println("Total amount :- " + (showTotal()-discount));
                System.out.println("-----------------------------------------------------");
                System.out.println("Thank you Come Again !....");
                System.out.println("**************************");
                System.exit(0);
            }
        }
    }
}
