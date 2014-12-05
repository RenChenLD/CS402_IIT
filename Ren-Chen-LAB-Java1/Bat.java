
public class Bat extends Creature implements Flyer {

	public Bat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void eat(Thing aThing)
	{
		if(!aThing.getClass().getSimpleName().equals("Thing"))
		{
			stomach.addElement(aThing);
			System.out.println(name + " has just eaten a " + aThing.toString());
		}else
			System.out.println(name + " does not eat " + aThing.name);
				
	}
	public void fly()
	{
		System.out.println(this.name + " " + this.getClass().getSimpleName() + " is swooping through the dark.");
	}
	public void move()
	{
		fly();
	}
}
