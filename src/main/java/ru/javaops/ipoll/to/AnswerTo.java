package ru.javaops.ipoll.to;

import lombok.Value;
import ru.javaops.ipoll.model.Type;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
public class AnswerTo {

    @NotNull
    Integer questionId;

    @NotBlank
    @Size(min = 5, max = 100)
    String text;

    Type type;

    public AnswerTo(Integer questionId, String text, Type type) {
        this.questionId = questionId;
        this.text = text;
        this.type = type;
    }
}
