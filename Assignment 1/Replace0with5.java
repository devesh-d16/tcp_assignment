public class Replace0with5 {
  public static int revNum(int temp) {
    int ans = 0;
    while (temp > 0) {
      int rem = temp % 10;
      ans = ans * 10 + rem;
      temp = temp / 10;
    }
    return ans;
  }

  public static int convertFive(int n) {
    int num = n;
    int con = 0;
    while (num > 0) {
      int rem = num % 10;
      if (rem == 0) {
        rem = rem + 5;
      }
      con = con * 10 + rem;
      num = num / 10;
    }
    return revNum(con);
  }

  public static void main(String[] args) {
    System.out.println(convertFive(200));
    System.out.println(convertFive(5002005));
  }
}
