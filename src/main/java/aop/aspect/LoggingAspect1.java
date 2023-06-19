package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


public class LoggingAspect1 {

    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Object returnValue=null;
        try{
            System.out.println("Before advice");
            returnValue=proceedingJoinPoint.proceed();
            System.out.println("After Returning");
        }
        catch (Throwable e){
            System.out.println("After Throwing");
        }
        System.out.println("After finally");
        return returnValue;
    }

    public void loggingAdvice(){
        System.out.println("Logging from the advice");
    }
}
