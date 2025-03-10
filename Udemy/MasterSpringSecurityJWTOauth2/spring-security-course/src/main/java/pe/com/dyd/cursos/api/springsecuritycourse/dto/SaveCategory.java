package pe.com.dyd.cursos.api.springsecuritycourse.dto;

import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

public class SaveCategory implements Serializable {

    @NotBlank
    private String name;
}
