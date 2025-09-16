package masai.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Seed {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seedId;

    private String commonName;

    private String bloomTime;

    private String watering;

    @NotNull
    private String difficultyLevel;

    private String temperature;

    @NotNull
    private String typeOfSeeds;

    private String seedsDescription;

    @NotNull
    private Integer seedsStock;

    @NotNull
    private Integer seedsCost;

    @NotNull
    private Integer seedsperiPacket;

    // >>> Added field to map back to Planter <<<
    @ManyToOne
    @JoinColumn(name = "planter_id")
    private Planter planter;
    // ------------------------------------------

    public Seed() {
        super();
    }

    public Seed(Integer seedId, String commonName, String bloomTime, String watering, @NotNull String difficultyLevel,
            String temperature, @NotNull String typeOfSeeds, String seedsDescription, @NotNull Integer seedsStock,
            @NotNull Integer seedsCost, @NotNull Integer seedsperiPacket) {
        super();
        this.seedId = seedId;
        this.commonName = commonName;
        this.bloomTime = bloomTime;
        this.watering = watering;
        this.difficultyLevel = difficultyLevel;
        this.temperature = temperature;
        this.typeOfSeeds = typeOfSeeds;
        this.seedsDescription = seedsDescription;
        this.seedsStock = seedsStock;
        this.seedsCost = seedsCost;
        this.seedsperiPacket = seedsperiPacket;
    }

    public Integer getSeedId() {
        return seedId;
    }

    public void setSeedId(Integer seedId) {
        this.seedId = seedId;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getBloomTime() {
        return bloomTime;
    }

    public void setBloomTime(String bloomTime) {
        this.bloomTime = bloomTime;
    }

    public String getWatering() {
        return watering;
    }

    public void setWatering(String watering) {
        this.watering = watering;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTypeOfSeeds() {
        return typeOfSeeds;
    }

    public void setTypeOfSeeds(String typeOfSeeds) {
        this.typeOfSeeds = typeOfSeeds;
    }

    public String getSeedsDescription() {
        return seedsDescription;
    }

    public void setSeedsDescription(String seedsDescription) {
        this.seedsDescription = seedsDescription;
    }

    public Integer getSeedsStock() {
        return seedsStock;
    }

    public void setSeedsStock(Integer seedsStock) {
        this.seedsStock = seedsStock;
    }

    public Integer getSeedsCost() {
        return seedsCost;
    }

    public void setSeedsCost(Integer seedsCost) {
        this.seedsCost = seedsCost;
    }

    public Integer getSeedsperiPacket() {
        return seedsperiPacket;
    }

    public void setSeedsperiPacket(Integer seedsperiPacket) {
        this.seedsperiPacket = seedsperiPacket;
    }

    // Getter & Setter for planter
    public Planter getPlanter() {
        return planter;
    }

    public void setPlanter(Planter planter) {
        this.planter = planter;
    }

    @Override
    public String toString() {
        return "Seed [seedId=" + seedId + ", commonName=" + commonName + ", bloomTime=" + bloomTime + ", watering="
                + watering + ", difficultyLevel=" + difficultyLevel + ", temperature=" + temperature + ", typeOfSeeds="
                + typeOfSeeds + ", seedsDescription=" + seedsDescription + ", seedsStock=" + seedsStock + ", seedsCost="
                + seedsCost + ", seedsperiPacket=" + seedsperiPacket + ", planter=" + (planter != null ? planter.getPlanterId() : null) + "]";
    }
}
