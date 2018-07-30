package vehicleInterface;
//program to implement interface
public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle[]=new Vehicle[3];  //array of vehicle class
		vehicle[0]=new TwoWheeler();
		vehicle[1]=new ThreeWheeler();  //stores instances of subclasses
		vehicle[2]=new FourWheeler();
		for(int i=0;i<2;i++) {
			if(i==1) {
				vehicle[i].Start();  
			}
		}
	}

}
