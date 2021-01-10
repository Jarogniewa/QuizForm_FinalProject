package pl.sda.quiz.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.quiz.dto.PollDto;
import pl.sda.quiz.mapper.PollMapper;
import pl.sda.quiz.model.PollEntity;
import pl.sda.quiz.repository.PollRepository;

@Service
@RequiredArgsConstructor
@Data
public class PollService {

    private final PollRepository pollRepository;
    private final PollMapper pollMapper;

    public Long save(PollDto pollDto) {
        PollEntity poll = pollMapper.map(pollDto);
        PollEntity savedPoll = pollRepository.save(poll);
        return savedPoll.getPollId();
    }
}
