package com.kodilla.patterns2.aop.calculator;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Aspect
public class Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    //Pierwsza wersja
//    @Before("execution(* com.kodilla.patterns2.aop.calculator.Calculator.factorial(..))")
//    public void logEvent() {
//        LOGGER.info("Logging the event");
//    }

    //Druga wersja
//    @Before("execution(* com.kodilla.patterns2.aop.calculator.Calculator.factorial(..))" +
//            "&& args(theNumber) && target(object)")
//    public void logEvent(BigDecimal theNumber, Object object) {
//        LOGGER.info("Class: " + object.getClass().getName() + ", Args: " + theNumber);
//    }


    @Around("execution(* com.kodilla.patterns2.aop.calculator.Calculator.factorial(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();                  // [1]
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();                    // [2]
            LOGGER.info("Time consumed " + (end - begin) + "[ms]");   // [3]
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());               // [4]
            throw throwable;
        }
        return result;
    }

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId) && target(object)")
    public void facadeLog(OrderDto order, long userId, Object object) {
        LOGGER.info("\nClass: " + object.getClass().getName() +
                "\nprocessOrder field arguments: " + "\nUserID: " + userId + order.toString());
    }
}