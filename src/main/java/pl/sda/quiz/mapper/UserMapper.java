package pl.sda.quiz.mapper;

import org.mapstruct.Mapper;
import pl.sda.quiz.dto.UserDto;
import pl.sda.quiz.model.UserEntity;

@Mapper
public interface UserMapper {

    UserEntity map(UserDto userDto);
}
