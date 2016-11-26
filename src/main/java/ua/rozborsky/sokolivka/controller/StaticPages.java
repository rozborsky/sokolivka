package ua.rozborsky.sokolivka.controller;



import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by roman on 07.10.2016.
 */
@Controller
public class StaticPages {

    @RequestMapping(value = {"/", "main"}, method = RequestMethod.GET)
    public String main() {
        final String plain_password ="1111";
        String pw_hash = BCrypt.hashpw(plain_password, BCrypt.gensalt());
        System.out.println(pw_hash);

        String pw_hash1 = BCrypt.hashpw(plain_password, BCrypt.gensalt());
        System.out.println(pw_hash1);

        System.out.println(BCrypt.checkpw(plain_password, pw_hash));
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
    public String signIn(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        model.addAttribute("username", getName());//todo get asername

        return "signInTMP";
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public String accessDenied() {
        return "accessDenied";
    }


    private String getName() {
        String currentUserName = "anon";
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            currentUserName = authentication.getName();
        }

        return currentUserName;
    }
}
