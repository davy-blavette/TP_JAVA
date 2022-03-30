package heritage_app;

public class Testeur {
	public static void main(String[] args) 
	  {
	       Apartment MyApartament = new Apartment();
	       Person person = new Person();
	       person.name = "Thomas";
	       person.house = MyApartament;
	       person.display();
	  }
}
