package com.codestates.chapter2.aop;


//Target
public class MyClass2 {

    @MyPoint  // Join Point
    void aaa(){
        System.out.println("aaa() Method Called.");
    }
    @MyPoint
    void bbb(){
        System.out.println("bbb() Method Called.");
    }
    void ccc(){
        System.out.println("ccc() Method Called.");
    }
    @MyPoint
    void ddd(){
        System.out.println("ddd() Method Called.");
    }
    void eee(){
        System.out.println("eee() Method Called.");
    }
}
