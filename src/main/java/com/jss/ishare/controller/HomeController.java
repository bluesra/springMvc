package com.jss.ishare.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class HomeController {

  @RequestMapping(value = "/", method = {GET, HEAD})
  public String home(Model model) {
   return "components";
  }

}
