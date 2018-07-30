import java.util.Scanner;
public class TestClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the real and imaginary part of a complex number");
		int real=sc.nextInt();
		int imaginary=sc.nextInt();
		int real1=sc.nextInt();
		int imaginary1=sc.nextInt();
		ComplexNumber cnumber=new ComplexNumber(real, imaginary);
		ComplexNumber cnumber1=new ComplexNumber( real1, imaginary1);
		cnumber.display(); //call display function
		cnumber1.display();
		ComplexNumber cnum=new ComplexNumber();//creation of object 
		cnum.sum(cnumber,cnumber1);
	}

}
