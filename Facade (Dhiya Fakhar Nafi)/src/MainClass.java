import Components.*;

public class MainClass {	//Main Driver dari Design Pattern Facade
	public static void main(String[] args) {
		
		Amplifier amp = new Amplifier("Amplifier Polytron");
		Tuner tuner = new Tuner("Tuner Polytron", amp);
		DvdPlayer dvd = new DvdPlayer("DVD Player LG", amp);
		CdPlayer cd = new CdPlayer("CD Player LG");
		Projector projector = new Projector("Projector WACOM", dvd);
		TheatreLights lights = new TheatreLights("Lampu Teater ");
		Screen screen = new Screen("Layar Teater");
		PopcornPopper popper = new PopcornPopper("Pembuat popcorn ");
 
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
		
		System.out.println("\nMemulai Film\n");
		homeTheater.watchMovie("Avengers");
		
		System.out.println("\nFilm Dimulai");
		
		System.out.println("\nFilm Selesai\n");
		homeTheater.endMovie();
	}
}