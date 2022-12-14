public class LeetCodeBank {

  public static int totalMoney(int n) {
    int increment = 0;
    int total = 0;
    int amount = 1;

    for (int i = 1; i <= n; i++) {

      total += amount + increment;
      amount++;
      if (i % 7 == 0) {
        increment++;
        amount = 1;
      }
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println(totalMoney(10));
  }
}
