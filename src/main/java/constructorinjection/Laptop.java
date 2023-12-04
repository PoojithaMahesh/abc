package constructorinjection;

public class Laptop {

	private int id;
	private String name;
	private String ram;

	
	public Laptop(int id, String name, String ram) {
		super();
		this.id = id;
		this.name = name;
		this.ram = ram;
	}


	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", ram=" + ram + "]";
	}
	
}
