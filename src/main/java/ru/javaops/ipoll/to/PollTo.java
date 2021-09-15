package ru.javaops.ipoll.to;

import lombok.Value;
import ru.javaops.ipoll.model.Answer;

import java.time.LocalDate;
import java.util.List;

@Value
public class PollTo {

    String name;
    LocalDate startDate;
    LocalDate endDate;
    String description;
    List<Answer> answers;

    public PollTo(String name, LocalDate startDate, LocalDate endDate, String description, List<Answer> answers) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.answers = answers;
    }
}
