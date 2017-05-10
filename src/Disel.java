
public class Disel extends Train{
	private String fuel;
	Disel(String TrainName, int TrainSpeed, int CountPasengers, int TrainLength, int CountOfTrainCars, String fuel) {
		super(TrainName, TrainSpeed, CountPasengers, TrainLength, CountOfTrainCars);
		// TODO Auto-generated constructor stub
		this.fuel = fuel;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
void trainRun(){
		super.trainRun();
		System.out.println("Вид палива: " + fuel);
		
	}
}
