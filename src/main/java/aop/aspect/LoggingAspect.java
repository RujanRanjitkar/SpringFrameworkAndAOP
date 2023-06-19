//package aop.aspect;
//
//import aop.model.Circle;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//
//
//@Aspect
//public class LoggingAspect {
//
////    @Before("execution(public String aop.model.Circle.getName())") // only runs for circle class
////    public void LoggingAdvice(){
////        System.out.println("Advice run. Get Method called");
////    }
//
////    (* get*(*)) for any method containing parameter (1 or more argument)
//    //    (* get*(..)) for any method which may or may not contain parameter (0 or more argument)
//    //    @Before("execution( * aop.aspect.model.get*())") for all classes
////    @Before("execution(public * get*())") // for all getter of any method -returns two calls
////    public void LoggingAdvice(){
////        System.out.println("Advice run. Get Method called");
////    }
//@Before("allCircleMethod()")
//public void LoggingAdvice(JoinPoint joinPoint){
////    System.out.println("Advice run. Get Method called");
////    Circle circle= (Circle) joinPoint.getTarget();
//}
////@After("args(name)")
////public void stringArgumentMethods(String name){
////    System.out.println("A method that takes String arguments has been called. The value is " + name);
////}
//
////    @AfterReturning("args(name)")
////    public void stringArgumentMethods(String name){
////        System.out.println("A method that takes String arguments has been called. The value is " + name);
////    }
//
//    @AfterReturning(pointcut = "args(name)", returning = "returnString")
//    public void stringArgumentMethods(String name, String returnString){
//        System.out.println("A method that takes String arguments has been called. The value is " + name + "The output value is " + returnString);
//    }
////    @AfterThrowing("args(name)")
////    public void exceptionAdvice(String name){
////        System.out.println("An exception has been thrown");
////    }
//@AfterThrowing(pointcut = "args(name)", throwing = "ex")
//public void exceptionAdvice(String name, Exception ex){
//    System.out.println("An exception has been thrown" + ex);
//}
//
////    @Before("allGetters() && allCircleMethod()")
////    public void LoggingAdvice(){
////        System.out.println("Advice run. Get Method called");
////    }
////    @Before("allGetters()")
////    public void secondAdvice(){
////        System.out.println("Second Advice executed");
////    }
//
////    @Around("allGetters()")
//    @Around("@annotation(aop.aspect.Loggable)")
//    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
//        Object returnValue=null;
//         try{
//             System.out.println("Before advice");
//             returnValue=proceedingJoinPoint.proceed();
//             System.out.println("After Returning");
//         }
//         catch (Throwable e){
//             System.out.println("After Throwing");
//         }
//        System.out.println("After finally");
//         return returnValue;
//    }
//    @Pointcut("execution(* get*()))")
//    public void allGetters(){}
//
////    @Pointcut("execution(* *aop.model.Circle.*(..))") // for all method of circle class
////    public void allCircleMethod(){}
//
//    //execution-> method
//    //within-> class
//    @Pointcut("within(aop.model.Circle)") // for all method of circle class
//    public void allCircleMethod(){}
//
//
//}
