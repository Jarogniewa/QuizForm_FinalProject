package pl.sda.QuizForm_FinalProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.QuizForm_FinalProject.dto.PollDto;
import pl.sda.QuizForm_FinalProject.dto.QuizDto;
import pl.sda.QuizForm_FinalProject.service.PollService;
import pl.sda.QuizForm_FinalProject.service.QuizService;

@Controller
@RequiredArgsConstructor
public class QuizController {

//    private final QuizService quizService;
//
//    @GetMapping("/create-quiz")
//    public String createQuiz(Model model)
//    {
//        model.addAttribute("quiz", new QuizDto());
//        return "create-quiz";
//    }
//
//    @PostMapping("/create-quiz")
//    public String saveQuiz(@ModelAttribute("quiz") QuizDto quiz)
//    {
//        quizService.save(quiz);
//        return "redirect:/index";
//    }
}
