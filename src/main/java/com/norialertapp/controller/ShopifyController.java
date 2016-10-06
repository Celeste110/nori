package com.norialertapp.controller;
import com.norialertapp.entity.Product;
import com.norialertapp.repository.ProductRepo;
import com.norialertapp.service.ShopifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by katherine_celeste on 9/29/16.
 */

@Controller
public class ShopifyController {

    @Autowired
    public ShopifyService shopifyService;

    @Autowired
    public ProductRepo productRepo;

//    @RequestMapping(path = "/notifications", method = RequestMethod.POST)
//    public String handleOrder()
//    {
//        return"";
//    }

    @RequestMapping(path = "/", method=RequestMethod.GET)
    public String listProducts(Model model){

        model.addAttribute("products", shopifyService.listProducts());

        return "dashboard";
    }
}
