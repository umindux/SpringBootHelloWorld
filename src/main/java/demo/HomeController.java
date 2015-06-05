package demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by umin on 15/6/4.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    String home(Model model){
        model.addAttribute("message","Hello World");
        return "hello";
    }
}
