import static org.junit.Assert.*;

import org.junit.Test;


public class TestAllTest {
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
	@Test
	public void testAnt() {
		Andy.whatDidYouEat();
		Andy.eat(rice);
		Andy.eat(grape);
		Andy.whatDidYouEat();
		Andy.move();
		System.out.println();
	}
	
	@Test
	public void testBat()
	{
		Chris.eat(apple);
		Chris.eat(Andy);
		Chris.whatDidYouEat();
		Chris.move();
		System.out.println();
	}
	
	@Test
	public void testFly()
	{
		Frank.eat(rice);
		Frank.eat(Andy);
		Frank.whatDidYouEat();
		Frank.move();
		System.out.println();
	}
	
	@Test
	public void testTiger()
	{
		Troy.eat(Berry);
		Troy.eat(rice);
		Troy.whatDidYouEat();
		Troy.move();
	}

}
