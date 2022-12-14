public class armstrongnumber {
  public static String armstrongNumber(int n) {
    int armSt = 0;
    int num = n;
    while (num > 0) {
      int rem = num % 10;
      armSt = armSt + rem * rem * rem;
      num = num / 10;
    }
    if (armSt == n) {
      return "Yes";
    } else {
      return "No";
    }
  }

  public static void main(String[] args) {
    System.out.println(armstrongNumber(153));
  }
}
