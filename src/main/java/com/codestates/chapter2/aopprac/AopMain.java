package com.codestates.chapter2.aopprac;

import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;

public class AopMain {
    public static void main(String[] args) throws Exception {
        MyClass myClass = new MyClass();
        MyAdvice myAdvice = new MyAdvice();

        for (Method m : myClass.getClass().getDeclaredMethods())
            myAdvice.invoke(m,new MyClass());
    }
}

//Advice
class MyAdvice {
    void invoke(Method m, Object obj) throws Exception{
        // Pointcut
        if(null != m.getAnnotation(Transactional.class)) {
            System.out.println("[Log Before] { ");
        }
        m.invoke(obj);
        if(null != m.getAnnotation(Transactional.class)) {
            System.out.println(" } [Log After]");
            System.out.println();
        }
    }
}


// Target
class MyClass {
    @Transactional // Join Point
    void A(){
        System.out.println("A() Method Called.");
    }
    @Transactional
    void B(){
        System.out.println("B() Method Called.");
    }
    @Transactional
    void C(){
        System.out.println("C() Method Called.");
    }
    void D(){
        System.out.println("D() Method Called.");
    }
    void E(){
        System.out.println("E() Method Called.");
    }
}

