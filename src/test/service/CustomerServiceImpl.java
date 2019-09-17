package test.service;

import test.dao.CustomerDao;
import test.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
    private CustomerDao customerDaoImpl=new CustomerDaoImpl();
    @Override
    public void saveCustomer() {
        System.out.println("Service");
        customerDaoImpl.saveCustomer();
    }
}
