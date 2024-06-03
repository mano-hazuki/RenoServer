package dev.manohazuki.renoserver.video;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
public class Video implements Serializable {

    @Id
    @NotNull
    private Long id;

    @NotEmpty
    private String title;

    @NotNull
    private String description;

    @NotNull
    @Min(0)
    private Long views;

    @NotNull
    @CreatedDate
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
