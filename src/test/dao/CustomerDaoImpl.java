package test.dao;

import test.dao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void saveCustomer() {
        System.out.println("Customer saved!");
    }
}
