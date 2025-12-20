import java.util.Scanner;

public class t2p25 {
  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Write your numbers:");
    System.out.print("Size of: ");
    int a = reader.nextInt();
    System.out.print("Size of: ");
    int b = reader.nextInt();
    System.out.print("Size of: ");
    int c = reader.nextInt();
    System.out.printf("V = %f\n", (double) (a * b * c));
    System.out.printf("S1 = %f, S2 = %f, S3 = %f\n", (double) (a * b), (double) (a * c), (double) (b * c));
    System.out.printf("S = %f\n", (double) (a * b) + (double) (a * c) + (double) (b * c));
    System.out.printf("P = %f\n", (double) (2 * a + 2 * b) + (double) (2 * a + 2 * c) + (double) (2 * b + 2 * c));
  }
}
