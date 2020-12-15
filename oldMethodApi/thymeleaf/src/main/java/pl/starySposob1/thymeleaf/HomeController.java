package pl.starySposob1.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public  String home(ModelMap map){
        map.put("hello", "Wyswietlenie tekstu z mapy ");

        return "home"; //resources/templates/home.html nazwa pliku html
    }

}
