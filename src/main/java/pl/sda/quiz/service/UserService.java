package pl.sda.quiz.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.quiz.dto.UserDto;
import pl.sda.quiz.mapper.UserMapper;
import pl.sda.quiz.model.UserEntity;
import pl.sda.quiz.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Data
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public Long save(UserDto userDto) {
        UserEntity user = userMapper.map(userDto);
        UserEntity savedUser = userRepository.save(user);
        return savedUser.getUserId();
    }
}
