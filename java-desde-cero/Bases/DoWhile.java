public class DoWhile {
  public static void main(String args[]) {

    int i = 100000;
    do {
      System.out.print(i + " ");
      if (i > 0) {
        System.out.print(",");
      }
      i -= 200;
    } while (i >= 0);
  }
}