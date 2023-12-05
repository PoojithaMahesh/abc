package withoutbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Value("1")
	private int id;
    @Value("HP")
	private String name;
    @Value("16gb")
	private String ram;
    
    @Autowired
    private Charger charger;
    
    
	public Charger getCharger() {
		return charger;
	}
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", ram=" + ram + ", charger=" + charger + "]";
	}
	
}

