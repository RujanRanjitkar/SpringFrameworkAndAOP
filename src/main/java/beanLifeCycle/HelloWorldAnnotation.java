package beanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorldAnnotation {
    private String message;

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void start() {
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void end() {
        System.out.println("Bean will destroy now.");
    }
}
