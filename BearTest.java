import static org.junit.Assert.*;
import org.junit.*;

public class BearTest{
  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before
  public void before() {
    bear = new Bear("Baloo");
    salmon = new Salmon();
    human = new Human();
    chicken = new Chicken();
  }

  @Test
  public void hasName(){
    assertEquals("Baloo", bear.getName());
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void shouldEmptyBellyAfterSleeping() {
    bear.eat(human);
    bear.eat(salmon);
    bear.sleep();
    assertEquals(0, bear.foodCount() );
  }

  @Test
  public void canEatHuman() {
    bear.eat(human);
    assertEquals( 1 , bear.foodCount() );
  }

  @Test
  public void canThrowUp() {
    bear.eat(salmon);
    Edible food = bear.throwUp();
    Salmon original = (Salmon) food;
    assertEquals("Swimming!" , original.swim() );
  }

  @Test
  public void canThrowUpChicken() {
    bear.eat(chicken);
    Edible food = bear.throwUp();
    Chicken original = (Chicken) food;
    assertEquals("Cluck!", original.cluck());
  }

  @Test
  public void chickenHasCalories() {
    assertEquals(200, chicken.nutritionValue());
  }

  @Test
  public void hasTotalNutrition() {
    bear.eat(chicken);
    bear.eat(human);
    bear.eat(salmon);
    assertEquals(2800, bear.totalNutrition() );
  }

}
