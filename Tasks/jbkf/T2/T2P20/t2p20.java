import java.util.Scanner;

public class t2p20 {
  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Write your number: ");
    int a = reader.nextInt();
    System.out.printf("Your number is %d\n", a);
    System.out.printf("Opposite number is %d\n", -a);
  }
}
