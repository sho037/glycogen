package obanyan.glycogen.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample31Controller {
    
    @GetMapping("/step1")
    public String sample31 (){
        return "sample31.html";
    }


}
