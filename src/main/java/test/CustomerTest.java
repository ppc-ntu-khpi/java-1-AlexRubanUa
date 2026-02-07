package test;

import domain.Customer;

public class CustomerTest {
    public static void main(String[] args) {
        System.out.println("Default Customer:");
        Customer customer = new Customer();
        customer.displayCustomerInfo();

        System.out.println("\nNew changed Customer: ");
        customer.setID(32);
        customer.setStatus(false);
        customer.setTotal(1998.56);
        customer.displayCustomerInfo();
    }
}
