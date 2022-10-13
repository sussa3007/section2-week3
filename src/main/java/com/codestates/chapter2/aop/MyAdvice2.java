package com.codestates.chapter2.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect // Advice 설정
@Component
public class MyAdvice2 { // Advice
//    @Around("execution(* com.codestates.chapter2.aop.MyClass2.aaa*(..))")
    @Around("@annotation(MyPoint)") // Pointcut 설정
    public Object invoke(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[Advice Before] { ");

        Object result = pjp.proceed();

        System.out.println(" } [Advice After]");
        System.out.println();

        return result;
    }
}
