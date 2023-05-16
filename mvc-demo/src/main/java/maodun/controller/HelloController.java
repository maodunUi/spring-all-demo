package maodun.controller;


import maodun.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "ok";
    }


    @ResponseBody
    @RequestMapping("/person")
    public String hello(Person person) {
        return person.getName();
    }
}
