public class CommonFactorsCount {
  public static int commonFactors(int a, int b) {
    int div = 0;
    if (a > b) {
      div = b;
    } else {
      div = a;
    }
    int count = 0;
    for (int i = 1; i <= div; i++) {
      if (a % i == 0 && b % i == 0) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(commonFactors(12, 6));
  }
}
