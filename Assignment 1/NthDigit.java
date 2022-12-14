public class NthDigit {
  public static int findNthDigit(int n) {
    int len = 1;
    long count = 9;
    int first = 1;

    while (n > len * count) {
      n -= len * count;
      len += 1;
      count = count * 10;
      first = first * 10;
    }

    first = first + ((n - 1) / len);
    String str = Integer.toString(first);
    return Character.getNumericValue(str.charAt((n - 1) % len));
  }

  public static void main(String[] args) {
    System.out.println(findNthDigit(1000));
  }
}
