package com.kou.controller;

import com.kou.domain.Items;
import com.kou.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JIAJUN KOU
 */

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items items = itemsService.findById(2);
        model.addAttribute("item",items);

        return "itemDetail";
    }
}
