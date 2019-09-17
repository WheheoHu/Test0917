package test.factory;

public class BeanFactory {
    public static Class<?> getCustomerService() {
        try {
            return Class.forName("test.service.CustomerServiceImpl");
        }catch (Exception e){
            throw new RuntimeException(e.toString());
        }
    }
    public static Class<?> getCustomerDao() {
        try {
            return Class.forName("test.dao.CustomerDaoImpl");
        }catch (Exception e){
            throw new RuntimeException(e.toString());
        }
    }
}
