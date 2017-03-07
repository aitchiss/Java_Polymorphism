class Human implements Edible {

  private int calories;

  public Human(){
    this.calories = 2500;
  }

  public String speak() {
    return "Speaking!";
  }

  public int nutritionValue() {
    return this.calories;
  }

}
