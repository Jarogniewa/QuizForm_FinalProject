package pl.sda.QuizForm_FinalProject.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.QuizForm_FinalProject.dto.PollDto;
import pl.sda.QuizForm_FinalProject.mapper.PollMapper;
import pl.sda.QuizForm_FinalProject.model.Poll;
import pl.sda.QuizForm_FinalProject.repository.PollRepository;

@Service
@RequiredArgsConstructor
@Data
public class PollService {

    private final PollRepository pollRepository;
    private final PollMapper pollMapper;

    public Long save(PollDto pollDto) {
        Poll poll = pollMapper.map(pollDto);
        Poll savedPoll = pollRepository.save(poll);
        return savedPoll.getPollId();
    }
}
