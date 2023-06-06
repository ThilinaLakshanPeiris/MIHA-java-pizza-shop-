import java.util.LinkedList;

public class Customers {

    LinkedList<Customers> GoldCustomers = new LinkedList<>();
    String Name ;
    String PhoneNum ;
    String Address;
    boolean Promo_msg ;

}
class GoldCustomer extends Customers {
    Boolean Promo_msg = true;
}

class NormalCustomer extends Customers{
    Boolean Promo_msg = true;
}
