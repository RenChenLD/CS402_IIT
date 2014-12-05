
public class Tiger extends Creature {

	public Tiger(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void move()
	{
		System.out.println(name + " " + this.getClass().getSimpleName().toString() +" has just pounced.");
	}
}
