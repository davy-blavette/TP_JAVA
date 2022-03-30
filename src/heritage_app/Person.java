package heritage_app;

public class Person {
	protected String name;
	  protected House house;
	  
	  public Person() 
	  {
	    name = "Thomas";
	    house = new House(150);
	  }
	  
	  public Person(String name, House house)
	  {
	    this.name = name;
	    this.house = house;
	  }
	  
	  public String getName()
	  {
	    return name;
	  }
	  
	  public void setName(String value) 
	  {
	    name = value;
	  }
	  
	  public House getHouse()
	  {
	    return house; 
	  }
	  
	  public void setHouse(House h)
	  {
	    house = h; 
	  }
	  
	  public void display() 
	  {
	    System.out.println("Je m'appele "+ name +".");
	    house.display();
	    house.door.display();
	  }
}
