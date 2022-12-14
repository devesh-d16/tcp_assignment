public class SumOfSeries {

  public static int sumOfSeries(int n) {
    int sum = 0;
    int digit = 0;
    while (n > 0) {
      digit = digit * 10 + 1;
      sum = sum + digit;
      n--;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sumOfSeries(6));
  }
}
