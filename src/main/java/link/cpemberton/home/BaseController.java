package link.cpemberton.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BaseController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/greet")
    public String greetings(Model model) {
        model.addAttribute("name", "Chris");
        return "greetings";
    }
}
