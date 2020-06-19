package com.win.coco_lashes.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {

    // @GetMapping("/")
    // public String home() {
    // return "home";
    // }

    @GetMapping("/subscribe")
    public String subscribe(@RequestParam(name = "name", required = false, defaultValue = "Coco Lover") String name,
            Model model) {
        model.addAttribute("name", name);
        return "subscribe";
    }
}