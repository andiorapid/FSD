import java.util.Scanner;

public class t2p22 {
  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Write your numbers: ");
    int a = reader.nextInt();
    int b = reader.nextInt();
    System.out.printf("%d + %d = %d\n", a, b, a + b);
    System.out.printf("%d * %d = %f\n", a, b, (double)(a * b));
    System.out.printf("%d - %d = %d\n", a, b, a - b);
    System.out.printf("%d - %d = %d\n", b, a, b - a);
  }
}
