package ee.team.sr8back.persistence.recipe;

import ee.team.sr8back.persistence.user.User;
import ee.team.sr8back.persistence.cookingtime.CookingTime;
import ee.team.sr8back.persistence.difficulty.Difficulty;
import ee.team.sr8back.persistence.mealtype.MealType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "recipe", schema = "smartrecipebook")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meal_type_id", nullable = false)
    private MealType mealType;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cooking_time_id", nullable = false)
    private CookingTime cookingTime;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "difficulty_id", nullable = false)
    private Difficulty difficulty;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 255)
    @NotNull
    @Column(name = "author", nullable = false)
    private String author;

    @NotNull
    @Column(name = "pax", nullable = false)
    private Integer pax;

    @Size(max = 500)
    @NotNull
    @Column(name = "instructions", nullable = false, length = 500)
    private String instructions;

}