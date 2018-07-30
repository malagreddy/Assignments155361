
public class PersonMain {

	public static void main(String[] args) {
		Person person1=new Person("mala",8,10,1996);
		Person person2=new Person("preethika",15,2,1997);
		person1.display();
		person2.display();
		person1.olderOne(person1, person2);
	}

}
