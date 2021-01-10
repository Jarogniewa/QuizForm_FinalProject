package pl.sda.quiz.mapper;
import org.mapstruct.Mapper;
import pl.sda.quiz.dto.PollDto;
import pl.sda.quiz.model.PollEntity;

@Mapper
public interface PollMapper {

    PollEntity map(PollDto pollDto);

}
