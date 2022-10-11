package com.codestates.chapter2.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;


public class CafeClient {
    @Test
    public static void main(String[] args) {
        GenericApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        MenuController menuController = context.getBean(MenuController.class);

        List<Menu> menuList = menuController.getMenus();

        for(Menu a : menuList)
            System.out.println(a);
    }
}
