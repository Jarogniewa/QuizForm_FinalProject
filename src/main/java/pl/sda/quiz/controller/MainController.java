package pl.sda.quiz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.quiz.dto.PollDto;
import pl.sda.quiz.dto.QuizDto;

@Controller
public class MainController {

    @GetMapping({"/", "/index"})
    public String mainPage() {
        return "index";
    }

    @GetMapping(path = "/poll")
    public String poll(Model model)
    {
        model.addAttribute("poll", new PollDto());
        return "poll";
    }

    @GetMapping(path = "/quiz")
    public String quiz(Model model)
    {
        model.addAttribute("quiz", new QuizDto());
        return "quiz";
    }

}
