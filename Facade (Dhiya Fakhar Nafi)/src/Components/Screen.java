package Components;

public class Screen {
	String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " dinaikan");
	}

	public void down() {
		System.out.println(description + " diturunkan");
	}


	public String toString() {
		return description;
	}
}