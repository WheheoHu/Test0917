package test.client;

import test.service.CustomerService;
import test.service.CustomerServiceImpl;

public class Client {
    public static void main(String[] args) {
        CustomerService customerService=new CustomerServiceImpl();
        customerService.saveCustomer();
    }
}
