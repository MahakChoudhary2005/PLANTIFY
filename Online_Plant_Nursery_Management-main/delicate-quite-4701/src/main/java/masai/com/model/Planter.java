package masai.com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.ToString;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Planter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer planterId;

    @DecimalMin(value = "1.0", message = "Height can't be 0")
    private Float planterHeight;

    @Min(value = 1, message = "Capacity can't be 0")
    private Integer planterCapacity;

    @Min(value = 1, message = "Drainage holes can't be 0")
    private Integer drainageHoles;

    @NotBlank(message = "Color can't be blank")
    private String planterColor;

    @NotBlank(message = "Shape can't be blank")
    private String planterShape;

    @Min(value = 0, message = "Stock can't be negative")
    private Integer planterStock;

    @Min(value = 1, message = "Cost can't be 0")
    private Integer planterCost;

    @OneToMany(mappedBy = "planter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Plant> plants;

    @OneToMany(mappedBy = "planter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Seed> seeds;
}
