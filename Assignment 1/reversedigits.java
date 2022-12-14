import java.util.*;

public class reversedigits {
  public static long reverse_digit(long n) {
    long rev = 0;
    while (n > 0) {
      long rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }
    return rev;
  }

  public static void main(String[] args) {
    System.out.println(reverse_digit(221));
  }
}
