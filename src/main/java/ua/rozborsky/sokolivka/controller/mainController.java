package ua.rozborsky.sokolivka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by roman on 07.10.2016.
 */
@Controller
public class mainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}
