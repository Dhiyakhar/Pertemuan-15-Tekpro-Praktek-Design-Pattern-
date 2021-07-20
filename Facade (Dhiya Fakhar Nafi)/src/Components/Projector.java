package Components;

public class Projector {
	String description;
	DvdPlayer dvdPlayer;
	
	public Projector(String description, DvdPlayer dvdPlayer) {
		this.description = description;
		this.dvdPlayer = dvdPlayer;
	}
 
	public void on() {
		System.out.println(description + " menyala");
	}
 
	public void off() {
		System.out.println(description + " mati");
	}

	public void wideScreenMode() {
		System.out.println(description + " diubah ke mode HD (16:9)");
	}

	public void tvMode() {
		System.out.println(description + " diubah ke mode TV (4:3)");
	}
  
        public String toString() {
                return description;
        }
}