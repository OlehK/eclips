
public class Train extends Mashine {

	int CountPasengers;
	int TrainLength;
	int CountOfTrainCars;
	Train(String MashineName, int SpeedAtTheMoment, int CountPasengers, int TrainLength, int CountOfTrainCars) {
		super(MashineName, SpeedAtTheMoment);
		this.CountPasengers = CountPasengers;
		this.TrainLength = TrainLength;
		this.CountOfTrainCars = CountOfTrainCars;
		// TODO Auto-generated constructor stub
	}
	
	
void trainRun(){
		
		System.out.println("����� �����: " + MashineName);
		System.out.println("��������� �����: " + SpeedAtTheMoment);
		System.out.println("ʳ������ �������� � ����: " + CountPasengers);
		System.out.println("������� ������: " + TrainLength);
		System.out.println("ʳ������ ������: " + CountOfTrainCars);
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getSpeed() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getMass() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCountPasenger() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCountWheels() {
		// TODO Auto-generated method stub

	}

}
