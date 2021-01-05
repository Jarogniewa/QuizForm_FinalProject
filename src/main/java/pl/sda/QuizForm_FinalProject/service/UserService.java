package pl.sda.QuizForm_FinalProject.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.QuizForm_FinalProject.dto.UserDto;
import pl.sda.QuizForm_FinalProject.mapper.UserMapper;
import pl.sda.QuizForm_FinalProject.model.User;
import pl.sda.QuizForm_FinalProject.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Data
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public Long save(UserDto userDto) {
        User user = userMapper.map(userDto);
        User savedUser = userRepository.save(user);
        return savedUser.getUserId();
    }
}
