package Customer;

import java.util.ArrayList;
import java.util.List;

public class ListCustomer {
    public static List<Customer> getCustomer() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Long","12/12/1234","Quang Tri","img/images.png" ));
        customers.add(new Customer("An","11/11/2345","Quang Ngãi","img/long.jpg" ));
        return customers;
    }
}
