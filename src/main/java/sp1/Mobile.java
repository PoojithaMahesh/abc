package sp1;

public class Mobile {

	public void used() {
		System.out.println("Mobile is used to chat with gf/bf");
	}
	private int id;
	private String name;
	private String color;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
}
