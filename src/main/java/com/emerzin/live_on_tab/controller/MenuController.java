package com.emerzin.live_on_tab.controller;

import com.emerzin.live_on_tab.model.MenuItem;
import com.emerzin.live_on_tab.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping
    public List<MenuItem> getMenuItems() {
        return menuService.getAllMenuItems();
    }
}
