package com.codestates.chapter2.di;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class MenuController {
    private MenuService menuService;

    @Autowired
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    public List<Menu> getMenus() {
        return menuService.getMenuList();
    }
}
