
public abstract class Mashine implements Run {
	final int MAXSPEED = 300;
	final int MINSPEED = 10;
	final int MINCOUNTPASENGER = 0;
	final int MAXCOUNTPASENGER = 500;
	String MashineName;
	int SpeedAtTheMoment;
	
	Mashine(String TrainName, int TrainSpeed){
		MashineName = TrainName;
		SpeedAtTheMoment = TrainSpeed;
	}
	
	public void PrintTransportName(){
		System.out.println("Vehicle title: " + MashineName);
	}
	
}
