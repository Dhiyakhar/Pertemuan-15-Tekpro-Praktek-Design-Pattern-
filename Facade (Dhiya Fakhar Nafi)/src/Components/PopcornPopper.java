package Components;

public class PopcornPopper {
	String description;
	
	public PopcornPopper(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + "menyala");
	}
 
	public void off() {
		System.out.println(description + "mati");
	}

	public void pop() {
		System.out.println(description + "menyala!");
	}
 
        public String toString() {
                return description;
        }
}