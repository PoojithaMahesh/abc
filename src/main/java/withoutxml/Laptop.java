package withoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Value("1")
	private int id;
    @Value("hp")
	private String name;
	@Autowired
    private Charger charger;
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", charger=" + charger + "]";
	}
	
}
