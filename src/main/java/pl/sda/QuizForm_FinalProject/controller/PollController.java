package pl.sda.QuizForm_FinalProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.QuizForm_FinalProject.dto.PollDto;
import pl.sda.QuizForm_FinalProject.service.PollService;

@Controller
@RequiredArgsConstructor
public class PollController {

    private final PollService pollService;

    @GetMapping("/create-poll")
    public String createPoll(Model model)
    {
        model.addAttribute("poll", new PollDto());
        return "create-poll";
    }

    @PostMapping("/create-poll")
    public String savePoll(@ModelAttribute("poll") PollDto poll)
    {
        pollService.save(poll);
        return "redirect:/index";
    }

}
