package site.dmarket.dmarketbackend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }
}
