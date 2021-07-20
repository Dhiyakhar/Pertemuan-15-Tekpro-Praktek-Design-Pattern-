package Components;

public class CdPlayer {
	
	String description;
	
	public CdPlayer(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " menyala");
	}
	
	public void off() {
		System.out.println(description + " mati");
	}
 
	public String toString() {
		return description;
	}
}