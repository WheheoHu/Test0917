package test.client;

import test.factory.BeanFactory;
import test.service.CustomerService;

public class Client {
    public static void main(String[] args) {
        CustomerService customerService= BeanFactory.getCustomerService();
        customerService.saveCustomer();
    }
}
