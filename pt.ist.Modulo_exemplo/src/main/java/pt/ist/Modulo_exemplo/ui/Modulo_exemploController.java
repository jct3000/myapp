package pt.ist.Modulo_exemplo.ui;

import org.fenixedu.bennu.spring.portal.SpringApplication;
import org.fenixedu.bennu.spring.portal.SpringFunctionality;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Modulo_exemplo")
@SpringApplication(group = "logged", path = "Modulo_exemplo", title = "title.Modulo_exemplo")
@SpringFunctionality(app = Modulo_exemploController.class, title = "title.Modulo_exemplo")
public class Modulo_exemploController {

    @RequestMapping
    public String home(Model model) {
        model.addAttribute("world", "World");
        return "Modulo_exemplo/home";
    }

}
