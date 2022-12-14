public class SumOfTwoPrime {

  public static boolean checkPrime(int a) {
    if (a == 0 || a == 1) {
      return false;
    }

    for (int i = 2; i <= a / 2; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static String twoPrime(int n) {

    for (int i = 1; i < n; i++) {
      if (checkPrime(i) == true && checkPrime(n - i) == true) {
        return "Yes";
      }
    }
    return "No";
  }

  public static void main(String[] args) {
    System.out.println(twoPrime(79));
  }
}
