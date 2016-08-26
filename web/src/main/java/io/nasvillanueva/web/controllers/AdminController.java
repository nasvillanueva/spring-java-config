package io.nasvillanueva.web.controllers;

import io.nasvillanueva.model.dto.UserAccountDto;
import io.nasvillanueva.services.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jvillanueva on 8/24/16.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserAccountService userAccountService;

    //mapped to GET /admin
    @RequestMapping
    @PreAuthorize("hasAuthority('ADMIN')") 
    public String index(Model model){
        model.addAttribute("adminList", userAccountService.getAll());
        return "admin/list";
    }

    //This will be mapped to POST /admin
    @RequestMapping(path = "/admin", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('ADMIN')")
    public String createAdmin(@ModelAttribute UserAccountDto userAccountDto){
        userAccountService.create(userAccountDto);
        return "redirect:/admin";
    }

    //mapped to POST /admin/update
    // Post since di kaya ni html form ung method na PUT
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('ADMIN')")
    public String updateUser(@ModelAttribute UserAccountDto userAccountDto){
        userAccountService.update(userAccountDto);
        return "redirect:/admin";
    }
}
