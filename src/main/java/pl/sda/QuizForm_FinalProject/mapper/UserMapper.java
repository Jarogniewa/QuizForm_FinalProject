package pl.sda.QuizForm_FinalProject.mapper;

import org.mapstruct.Mapper;
import pl.sda.QuizForm_FinalProject.dto.UserDto;
import pl.sda.QuizForm_FinalProject.model.User;

@Mapper
public interface UserMapper {

    User map(UserDto userDto);
}
