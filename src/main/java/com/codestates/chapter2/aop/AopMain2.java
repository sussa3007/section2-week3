package com.codestates.chapter2.aop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class AopMain2 {
    public static void main(String[] args) {
        GenericApplicationContext context =
                new AnnotationConfigApplicationContext(config.class);
        MyClass2 myClass = context.getBean(MyClass2.class);

        myClass.aaa();
        myClass.bbb();
        myClass.ccc();
        myClass.ddd();
        myClass.eee();
    }
}
