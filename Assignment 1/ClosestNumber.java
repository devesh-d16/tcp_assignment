public class ClosestNumber {

  public static int closestNumber(int N, int M) {

    int div = N / M;

    int a1 = div * M;
    int a2 = (N * M) > 0 ? (M * (div + 1)) : (M * (div - 1));

    if (Math.abs(N - a1) < Math.abs(N - a2)) {
      return a1;
    }
    return a2;
  }

  public static void main(String[] args) {
    System.out.println(closestNumber(13, 4));
  }
}
