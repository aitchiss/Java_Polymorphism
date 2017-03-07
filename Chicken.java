class Chicken implements Edible {

  private int calories;

  public Chicken(){
    this.calories = 200;
  }

  public String cluck() {
    return "Cluck!";
  }

  public int nutritionValue() {
    return this.calories;
  }

}
