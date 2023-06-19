package simpleDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("addressSetterInjection.xml");
        Address address1 = (Address) context.getBean("Rujan");
        Address address2 = (Address) context.getBean("Babulal");
        System.out.println(address1.getStreet() + " " + address1.getCity() + " " + address1.getCountry());
        System.out.println(address2.getStreet() + " " + address2.getCity() + " " + address2.getCountry());


    }
}
