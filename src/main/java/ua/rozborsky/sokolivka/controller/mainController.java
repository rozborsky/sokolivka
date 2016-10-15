package ua.rozborsky.sokolivka.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.rozborsky.sokolivka.classes.User;
import ua.rozborsky.sokolivka.interfaces.Person;

import javax.validation.Valid;


/**
 * Created by roman on 07.10.2016.
 */
@Controller
public class mainController {

    @Autowired
    private Person person;

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public ModelAndView signUp() {

        return new ModelAndView("signUp", "person", person);
    }

    @RequestMapping(value = "/registrationHandler", method = RequestMethod.POST)
    public String registrationHandler(@Valid @ModelAttribute("person") User person,
                                      BindingResult bindingResult) {
        if(!person.isEqualsPasswords()){
            bindingResult.rejectValue("password", "password", "паролі не співпадають");
        }
        if (bindingResult.hasErrors()){
            return "signUp";
        }
        return "redirect:/cabinet";
    }

    @RequestMapping(value = "/cabinet", method = RequestMethod.GET)
    public String cabinet() {
        return "cabinet";
    }

    @RequestMapping(value = "/enterData", method = RequestMethod.GET)
    public ModelAndView enterData(@RequestParam(value = "error", required = false) String error) {
        ModelAndView modelAndView = new ModelAndView();
        if (error != null) {
            modelAndView.addObject("error", "Invalid username or password");
        }

        modelAndView.setViewName("enterData");

        return modelAndView;
    }
}
