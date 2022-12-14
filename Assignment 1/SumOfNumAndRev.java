public class SumOfNumAndRev {
  public static int reverse(int a) {
    int rev = 0;
    while (a > 0) {
      int rem = a % 10;
      rev = rev * 10 + rem;
      a = a / 10;
    }
    return rev;
  }

  public static boolean sumOfNumberAndReverse(int num) {
    if (num == 0) {
      return true;
    }
    for (int i = 0; i < num; i++) {
      if ((i + reverse(i)) == num) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(sumOfNumberAndReverse(443));
  }
}
