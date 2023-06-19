package aop;

import aop.service.FactoryService;
import aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context= new ClassPathXmlApplicationContext("aop.xml");
//        ShapeService shapeService=context.getBean("shapeService", ShapeService.class);
////      shapeService.getCircle().setName("Dummy name");
//        shapeService.getCircle();
////        shapeService.getCircle().setNameAndReturn("Dummy name");
////        System.out.println(shapeService.getCircle().getName());

        FactoryService factoryService=new FactoryService();
        ShapeService shapeService=(ShapeService) factoryService.getBean("shapeService");
        shapeService.getCircle();

    }
}
