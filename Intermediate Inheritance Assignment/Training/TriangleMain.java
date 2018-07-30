// program to implement the calculation of training charges
public class TriangleMain {

	public static void main(String[] args) {
		Training training=new PublicTraining(100,"Java",5000,50);	//upcasting
		Training training1=new CorporateTraining(200,"Bigdata",3500,4);	//upcasting
				
		training.getOrderValue();
		System.out.println("cost of training for java is:"+training.getCost());
		training1.getOrderValue();
		System.out.println("cost of training for bigdata is:"+training1.getCost());
	}

}
