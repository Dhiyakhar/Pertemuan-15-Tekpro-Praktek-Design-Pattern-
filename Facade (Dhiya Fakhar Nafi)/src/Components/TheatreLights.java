package Components;

public class TheatreLights {
	String description;

	public TheatreLights(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + "menyala");
	}

	public void off() {
		System.out.println(description + "mati");
	}

	public void dim(int level) {
		System.out.println(description + "dinaikkan hingga " + level  + "%");
	}

	public String toString() {
		return description;
	}
}