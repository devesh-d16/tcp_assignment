public class HowManyX {

  public static int countX(int L, int R, int X) {
    int count = 0;
    for (int i = L + 1; i < R; i++) {
      int n = i;
      while (n > 0) {
        int rem = n % 10;
        if (rem == X) {
          count++;
        }
        n = n / 10;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countX(10, 19, 1));
  }
}
