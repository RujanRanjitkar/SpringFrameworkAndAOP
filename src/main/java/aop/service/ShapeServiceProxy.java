package aop.service;

import aop.aspect.LoggingAspect1;
import aop.model.Circle;

public class ShapeServiceProxy extends ShapeService{
    public Circle getCircle() {
        new LoggingAspect1().loggingAdvice();
        return super.getCircle();
    }
}

