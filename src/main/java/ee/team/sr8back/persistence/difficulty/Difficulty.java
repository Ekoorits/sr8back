package ee.team.sr8back.persistence.difficulty;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "difficulty", schema = "smartrecipebook")
public class Difficulty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "level_name", nullable = false)
    private String levelName;

    @NotNull
    @Column(name = "level_number", nullable = false)
    private Integer levelNumber;

}