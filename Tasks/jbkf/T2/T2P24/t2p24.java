import java.util.Scanner;

public class t2p24 {
  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Write your numbers: ");
    int a = reader.nextInt(); 
    int b = reader.nextInt();
    System.out.printf("S = %f\n",(double) (a * b));
    System.out.printf("P = %f\n",(double) (2 * (a + b)));
  }
}
