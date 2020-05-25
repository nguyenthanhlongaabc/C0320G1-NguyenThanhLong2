package sort;

import models.Customer;

import java.util.Comparator;

public class NameCustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2){
        if (c1.getNameCustomer().compareTo(c2.getNameCustomer()) == 0){
            return c1.getBirthday().compareTo(c2.getBirthday());
        }
        return c1.getNameCustomer().compareTo(c2.getNameCustomer());
    }
}
