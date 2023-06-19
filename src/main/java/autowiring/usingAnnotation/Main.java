package autowiring.usingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiringUsingAnnotation.xml");
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);

    }
}
