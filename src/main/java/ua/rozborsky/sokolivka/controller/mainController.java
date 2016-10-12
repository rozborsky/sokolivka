package ua.rozborsky.sokolivka.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.rozborsky.sokolivka.server.HibernateUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by roman on 07.10.2016.
 */
@Controller
public class mainController {

    @RequestMapping(value = {"/", "main"}, method = RequestMethod.GET)
    public String main() {

        return "main";
    }

    @RequestMapping(value = "/history", method = RequestMethod.GET)
    public String history() {
        return "history";
    }

    @RequestMapping(value = "/gallery", method = RequestMethod.GET)
    public String gallery() {
        return "gallery";
    }

    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    public String chat() {
        return "chat";
    }

    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public String signIn() {
        return "signInTMP";
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public String accessDenied() {
        return "accessDenied";
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
