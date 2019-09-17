package test.factory;

import test.dao.CustomerDao;
import test.dao.CustomerDaoImpl;
import test.service.CustomerService;
import test.service.CustomerServiceImpl;

public class BeanFactory {
    public static CustomerService getCustomerService() {
        try {
            return (CustomerServiceImpl)Class.forName("test.service.CustomerServiceImpl").newInstance();
        }catch (Exception e){
            throw new RuntimeException(e.toString());
        }
    }
    public static CustomerDao getCustomerDao() {
        try {
            return (CustomerDaoImpl)Class.forName("test.dao.CustomerDaoImpl").newInstance();
        }catch (Exception e){
            throw new RuntimeException(e.toString());
        }
    }
}
