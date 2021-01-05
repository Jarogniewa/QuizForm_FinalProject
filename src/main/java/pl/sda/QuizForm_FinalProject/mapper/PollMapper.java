package pl.sda.QuizForm_FinalProject.mapper;
import org.mapstruct.Mapper;
import pl.sda.QuizForm_FinalProject.dto.PollDto;
import pl.sda.QuizForm_FinalProject.model.Poll;

@Mapper
public interface PollMapper {

    Poll map(PollDto pollDto);

}
