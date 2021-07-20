package Components;

public class Tuner {
	String description;
	Amplifier amplifier;
	double frequency;

	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + "menyala");
	}

	public void off() {
		System.out.println(description + "mati");
	}

	public void setFrequency(double frequency) {
		System.out.println(description + " atur frekuensi ke " + frequency);
		this.frequency = frequency;
	}

	public void setAm() {
		System.out.println("mode AM menyala");
	}

	public void setFm() {
		System.out.println("mode FM menyala");
	}

	public String toString() {
		return description;
	}
}