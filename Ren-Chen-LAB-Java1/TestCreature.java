
public class TestCreature {
	public static final int CREATURE_COUNT = 6;
	public static final int THING_COUNT = 10;
	public static void main(String[] args) {
		Creature Andy = new Ant("Andy");
		Creature Berry = new Ant("Berry");
		Creature Chris = new Bat("Chris");
		Creature Dean = new Bat("Dean");
		Creature Frank = new Fly("Frank");
		Creature Troy = new Tiger("Troy");
		
		Thing apple = new Thing("apple");
		Thing banana = new Thing("banana");
		Thing chocolate = new Thing("chcoclate");
		Thing grape = new Thing("grape");
		Thing rice = new Thing("rice");
		
		Creature[] creatures = {Andy, Berry, Chris, Dean, Frank, Troy};
		Thing[] things = {Andy, apple, Berry, banana, Chris, chocolate, Dean, Frank, grape, rice, Troy};
		System.out.println("Things: ");
		System.out.println();
		for(int i = 0; i < THING_COUNT; i ++)
		{
			System.out.println(things[i].toString());
		}
		System.out.println();
		System.out.println("creatures: ");
		System.out.println();
		for(int i = 0; i < CREATURE_COUNT; i ++)
		{
			System.out.println(creatures[i].toString());
		}
		System.out.println();

		Andy.eat(rice);
		Andy.eat(grape);
		Andy.whatDidYouEat();
		Andy.move();
		System.out.println();
		
		Chris.eat(apple);
		Chris.eat(Andy);
		Chris.whatDidYouEat();
		Chris.move();
		System.out.println();

		
		Frank.eat(rice);
		Frank.eat(Andy);
		Frank.whatDidYouEat();
		Frank.move();
		System.out.println();

		
		Troy.eat(Berry);
		Troy.eat(rice);
		Troy.whatDidYouEat();
		Troy.move();
		
	}

}
