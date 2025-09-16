package masai.com.model;

import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;




@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    private Integer quantity;
    private Integer totalCost;
    private LocalDate orderDate;
    private Integer customerId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_seeds")
    private List<Seed> seeds;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_plants")
    private List<Plant> plants;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "order_planters")
    private List<Planter> planters;

    public Orders() {}   // single no-args

    public Orders(Integer orderId, Integer quantity, Integer totalCost,
                  LocalDate orderDate, Integer customerId,
                  List<Seed> seeds, List<Plant> plants, List<Planter> planters) {
        this.orderId = orderId;
        this.quantity = quantity;
        this.totalCost = totalCost;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.seeds = seeds;
        this.plants = plants;
        this.planters = planters;
    }

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public List<Seed> getSeeds() {
		return seeds;
	}

	public void setSeeds(List<Seed> seeds) {
		this.seeds = seeds;
	}

	public List<Plant> getPlants() {
		return plants;
	}

	public void setPlants(List<Plant> plants) {
		this.plants = plants;
	}

	public List<Planter> getPlanters() {
		return planters;
	}

	public void setPlanters(List<Planter> planters) {
		this.planters = planters;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", quantity=" + quantity + ", totalCost=" + totalCost + ", orderDate="
				+ orderDate + ", customerId=" + customerId + ", seeds=" + seeds + ", plants=" + plants + ", planters="
				+ planters + "]";
	}

    // getters/setters + toString …
    
}
