package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
        Address address = (Address) context.getBean("address");
        System.out.println(address.getAddressList());
        System.out.println(address.getAddressSet());
        System.out.println(address.getAddressMap());
        System.out.println(address.getAddressProp());
    }
}
