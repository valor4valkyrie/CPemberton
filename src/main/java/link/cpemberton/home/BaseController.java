package link.cpemberton.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.math.BigDecimal;
import java.math.BigInteger;

@Controller
public class BaseController {

    @ModelAttribute("images")
    public String images(){
        return "webapp/images";
    }

    @GetMapping("/")
    public String home(Model model){
        BigInteger in = new BigInteger("3");
        BigDecimal dec = new BigDecimal(3);

        BigInteger integer = new BigInteger("33183473123581");
        BigDecimal decimal = new BigDecimal(32131838);
        in.add(integer);
        dec.add(decimal);

        return "index";
    }

    @GetMapping("/greet")
    public String greetings(Model model) {
        model.addAttribute("name", "Chris");
        return "greetings";
    }
}
