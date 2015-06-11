package com.jss.ishare.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import com.jss.ishare.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by apple on 6/9/15.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        if(errors.hasErrors()) {
            return "registerForm";
        }

        System.out.println(spitter.toString()) ;
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}")
    public String showSpitterProfile(@PathVariable String username, Model model) {
        Spitter spitter = new Spitter(username, "passwor", "firstname", "lastname", "email");
        model.addAttribute(spitter);
        System.out.println("username" + username);
        return "profile";
    }
}
