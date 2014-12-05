
public class Ant extends Creature {

	public Ant(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void move()
	{
		System.out.println(this.name + " " + this.getClass().getSimpleName() + " is crawling around.");
	}
	
}
