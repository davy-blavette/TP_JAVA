package heritage_app;

public class House {
	protected int surface;
	  protected Door door;
	    
	  public House(int surface) 
	  {
	    this.surface = surface;
	    door = new Door();
	  }
	    
	  public int getSurface()
	  {
	    return surface;
	  }
	    
	  public void setSurface(int value)
	  {
	    surface = value;
	  }
	    
	  public Door getDoor()
	  {
	    return door; 
	  }
	    
	  public void setDoor(Door d)
	  {
	    door = d;
	  }
	    
	  public void display() 
	  {
	    System.out.println("Je suis une maison, ma surface est de "+ surface +" m2.");
	  }
}
