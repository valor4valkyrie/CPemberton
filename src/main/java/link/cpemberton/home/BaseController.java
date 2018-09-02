package link.cpemberton.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {

    @GetMapping("/")
    public ModelAndView home(ModelAndView mav){
        String test = "Test";
        mav.addObject(test);
        return mav;
    }
}
