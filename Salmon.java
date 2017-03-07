class Salmon implements Edible {

  private int calories;

  public Salmon(){
    this.calories = 100;
  }

  public String swim() {
    return "Swimming!";
  }

  public int nutritionValue() {
    return this.calories;
  }

}
