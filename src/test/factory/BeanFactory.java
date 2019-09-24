package test.factory;


import java.awt.*;
import java.util.*;

public class BeanFactory {
    private static ResourceBundle resourceBundle=ResourceBundle.getBundle("bean");

    private static Map<String,Object> beanmap= new HashMap<>();

    static {
        Enumeration<String> keys=resourceBundle.getKeys();
        while (keys.hasMoreElements()){
            String key=(String)keys.nextElement();
            String beanPath=resourceBundle.getString(key);
            try {
                Object object=Class.forName(beanPath).getDeclaredConstructor().newInstance();
                beanmap.put(key,object);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
    public static Object getBean(String className) {
       return beanmap.get(className);
    }


}
