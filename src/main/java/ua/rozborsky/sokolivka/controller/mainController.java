package ua.rozborsky.sokolivka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String signUp() {
        return "signUp";
    }

}
