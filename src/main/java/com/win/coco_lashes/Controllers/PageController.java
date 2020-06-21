package com.win.coco_lashes.Controllers;

import com.win.coco_lashes.Subscribe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

@Controller
// @RestController
public class PageController {

    // @GetMapping("/")
    // public String home() {
    // return "home";
    // }

    // @GetMapping("/subscribe")
    // public String subscribe(@RequestParam(value = "name", required = false,
    // defaultValue = "Coco Lover") String name,
    // Model model) {
    // model.addAttribute("name", name);
    // // model.addAttribute("subscribe", new Subscribe());
    // return "subscribe";
    // }

    @GetMapping("/subscribe")
    // @RequestMapping("/subscribe")
    public String subscribeForm(Model model) {
        model.addAttribute("subscribe", new Subscribe());
        return "subscribe";
    }

    @PostMapping("/subscribe")
    public String subscribeSubmit(@ModelAttribute Subscribe subscribe) {
        return "result";
    }
}