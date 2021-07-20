package Components;

public class DvdPlayer {
	String description;
	int currentTrack;
	Amplifier amplifier;
	String movie;
	
	public DvdPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println(description + " menyala");
	}
 
	public void off() {
		System.out.println(description + " mati");
	}

        public void eject() {
		movie = null;
                System.out.println(description + " berhenti");
        }
 
	public void play(String movie) {
		this.movie = movie;
		currentTrack = 0;
		System.out.println(description + " Memutar film \"" + movie + "\"");
	}

	public void play(int track) {
		if (movie == null) {
			System.out.println(description + " tidak dapat memutar film " + track + " karena tidak ada DVD yang dimasukkan");
		} else {
			currentTrack = track;
			System.out.println(description + " memutar " + currentTrack + " film \"" + movie + "\"");
		}
	}

	public void stop() {
		currentTrack = 0;
		System.out.println(description + " menghentikan film \"" + movie + "\"");
	}
 
	public void pause() {
		System.out.println(description + " menunda film \"" + movie + "\"");
	}

	public void setTwoChannelAudio() {
		System.out.println(description + " mengatur mode two channel audio");
	}
 
	public void setSurroundAudio() {
		System.out.println(description + " mengatur mode surround audio");
	}
 
	public String toString() {
		return description;
	}
}