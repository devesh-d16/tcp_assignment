import java.util.*;;

public class zoos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int z = 0, o = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'z') {
        z++;
      } else {
        o++;
      }
    }
    if (2 * z == o) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
