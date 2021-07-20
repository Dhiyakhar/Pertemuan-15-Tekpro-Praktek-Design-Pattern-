package Components;

public class Amplifier {
	String description;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " menyala");
	}
 
	public void off() {
		System.out.println(description + " mati");
	}
 
	public void setStereoSound() {
		System.out.println(description + " menyalakan mode stereo");
	}
 
	public void setSurroundSound() {
		System.out.println(description + " menyalakan mode surround (5 speaker dan 1 subwoofer)");
	}
 
	public void setVolume(int level) {
		System.out.println(description + " Menaikkan volume ke " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " Menaikkan tuner ke " + dvd);
		this.tuner = tuner;
	}
  
	public void setDvd(DvdPlayer dvd) {
		System.out.println(description + " Mengatur DVD Player " + dvd);
		this.dvd = dvd;
	}
 
	public void setCd(CdPlayer cd) {
		System.out.println(description + " Mengatur CD Player " + cd);
		this.cd = cd;
	}
 
	public String toString() {
		return description;
	}
}