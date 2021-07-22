package GGGGGGGGGGGGG;

public class ChocoBoil {
	public static void main(String[] args) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
		
		//Memanggil instance yang sama walaupun object yang berbedas
		ChocolateBoiler boile2r = ChocolateBoiler.getInstance();
	}
}
