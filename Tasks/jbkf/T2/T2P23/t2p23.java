import java.util.Scanner;

public class t2p23 {
  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Write your number: ");
    int a = reader.nextInt();
    int b = reader.nextInt();
    System.out.println((double)Math.pow(a, 2));
    System.out.println((double)Math.pow(b, 2));
    System.out.println((double)Math.pow(a, 2) + (double)Math.pow(b, 2));
  }
}
