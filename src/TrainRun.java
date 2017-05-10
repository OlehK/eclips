
public class TrainRun {
	public static void main(String[] args) {
		Paravoth hundai = new Paravoth("Hundai", 500, 150, 400, 5, "паровий");
		Disel skoda = new Disel("Skhoda", 100, 350, 800, 15, "дизель");
		
		hundai.trainRun();
		skoda.trainRun();
	}
}
