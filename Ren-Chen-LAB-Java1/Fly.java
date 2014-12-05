
public class Fly extends Creature implements Flyer {

	public Fly(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void eat(Thing aThing)
	{
		if(aThing.getClass().getSimpleName().toString().equals("Thing"))
		{
			stomach.addElement(aThing);
			System.out.println(name + " has just eaten a " + aThing.toString());
		}else
			System.out.println(name + " does not eat " + aThing.toString());
	}
	
	public void fly()
	{
		System.out.println(this.name + " " + this.getClass().getSimpleName() + " is buzzing around in flight.");
	}
	
	public void move()
	{
		fly();
	}
}
