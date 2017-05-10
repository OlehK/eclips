
public class Paravoth extends Train  {
	private String EngineType;
	Paravoth(String TrainName, int TrainSpeed, int CountPasengers, int TrainLength, int CountOfTrainCars, String EngineType) {
		super(TrainName, TrainSpeed, CountPasengers, TrainLength, CountOfTrainCars);
		
		this.EngineType = EngineType;
	}
	public String getEngineType() {
		return EngineType;
	}
	public void setEngineType(String engineType) {
		EngineType = engineType;
	}
void trainRun(){
		super.trainRun();
		System.out.println("Вид двигуна: " + EngineType);
		
	}
	
	
}
