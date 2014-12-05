import java.util.Stack;


public abstract class Creature extends Thing{
	Stack<Thing> stomach = new Stack<Thing>();
	public Creature(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void eat(Thing aThing)
	{
		stomach.addElement(aThing);
		System.out.println(name + " has just eaten a " + aThing.toString());
	}
	public abstract void move();
	public void whatDidYouEat()
	{
		if(stomach.isEmpty())
			System.out.println("The stomach is empty!");
		else
		{
			for(int i = 0; i < stomach.size(); i++)
				System.out.print(stomach.elementAt(i) + "        ");
			System.out.println();
		}
	}
	
	
}
