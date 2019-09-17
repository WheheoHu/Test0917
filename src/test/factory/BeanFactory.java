package test.factory;


import java.util.ResourceBundle;

public class BeanFactory {
    private static ResourceBundle resourceBundle=ResourceBundle.getBundle("bean");

    public static Object getBean(String className) {
        try {
            String name=resourceBundle.getString(className);
            return Class.forName(name).newInstance();
        }catch (Exception e){
            throw new RuntimeException(e.toString());
        }
    }


}
