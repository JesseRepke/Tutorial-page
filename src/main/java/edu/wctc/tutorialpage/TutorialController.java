package edu.wctc.tutorialpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TutorialController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/tutorial1")
    public String tutorial1() {
        return "tutorial1";
    }

    @GetMapping("/tutorial2")
    public String tutorial2() {
        return "tutorial2";
    }

    @GetMapping("/tutorial3")
    public String tutorial3() {
        return "tutorial3";
    }
}