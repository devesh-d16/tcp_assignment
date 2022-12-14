public class CheckPrime {
  public static int isPrime(int N) {
    if (N == 0 || N == 1) {
      return 0;
    }
    for (int i = 2; i <= Math.sqrt(N); i++) {
      if (N % i == 0) {
        return 0;
      }
    }
    return 1;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(79));
    System.out.println(isPrime(10));
    System.out.println(26368 / (-4424));
  }
}
