
//TODO Make sure Motorcycle extends the RoadVehicle class
public class Motorcycle extends RoadVehicle
{
	
	public Motorcycle()
	{
		//TODO Invoke Motorcycle's parent class's constructor
		//2 wheels, 1 passenger, 0.8 fuel efficiency
		super(2, 1, 0.8);
	}
	
	public void popAWheelie()
	{
		System.out.println("Rad!");
	}
}
