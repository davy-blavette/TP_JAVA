package heritage_app;

public class Door {
	protected String color;
    
	  public Door() 
	  {
	    color = "blue";
	  }
	    
	  public Door(String color) 
	  {
	    this.color = color;
	  }
	    
	  public String getColor()
	  {
	    return color;
	  }
	    
	  public void setColor(String value)
	  {
	    color = value;
	  }
	    
	  public void display() 
	  {
	    System.out.println("Je suis une porte, ma couleur est "+ color +".");
	  }
}
