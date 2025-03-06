package pe.com.dyd.cursos.api.springsecuritycourse.dto;


import jakarta.persistence.Entity;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class SaveProduct implements Serializable {

    private String name;
    private BigDecimal price;
    private Long categoryId;

}
