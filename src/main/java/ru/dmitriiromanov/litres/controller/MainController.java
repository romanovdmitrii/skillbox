package ru.dmitriiromanov.litres.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.dmitriiromanov.litres.controller.exception.MyException;

@Controller
@Slf4j
@RequestMapping(value = "/litres")
public class MainController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/exception")
    public String exception(Model model) throws MyException {
        model.addAttribute("title", "exception");
        if (true)
            throw new MyException();
        return "home";
    }
}
