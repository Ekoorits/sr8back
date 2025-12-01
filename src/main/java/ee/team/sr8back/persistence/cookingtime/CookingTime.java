package ee.team.sr8back.persistence.cookingtime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cooking_time", schema = "smartrecipebook")
public class CookingTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "minutes_max", nullable = false)
    private Integer minutesMax;

}