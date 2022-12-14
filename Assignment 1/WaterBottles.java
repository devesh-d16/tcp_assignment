public class WaterBottles {

  public static int numWaterBottles(int numBottles, int numExchange) {
    int drink = numBottles;
    int newBottles = 0;
    int remainBottles = 0;
    while (numBottles > 0) {
      newBottles = numBottles / numExchange;
      remainBottles = numBottles % numExchange;
      drink = drink + newBottles;
      numBottles = (numBottles > numExchange) ? (newBottles + remainBottles) : (0);
    }
    return drink;
  }

  public static void main(String[] args) {
    System.out.println(numWaterBottles(5, 5));
    System.out.println(numWaterBottles(15, 4));
  }
}
