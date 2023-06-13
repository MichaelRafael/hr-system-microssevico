package br.com.michael.userapi.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class StandardError {

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime localDateTime;
    private Integer status;
    private String error;
    private String path;

}
