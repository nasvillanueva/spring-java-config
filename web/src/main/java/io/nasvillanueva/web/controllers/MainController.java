package io.nasvillanueva.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jvillanueva on 8/24/16.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping
    public String index(Model model){
        model.addAttribute("Teest", "Nas");
        return "index";
    }
}
