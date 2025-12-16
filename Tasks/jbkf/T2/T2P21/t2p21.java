import java.util.Scanner;

public class t2p21 {
  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Write your number: ");
    int a = reader.nextInt();
    System.out.printf("Number 1 = %d\nNumber 2 = %d\nNumber 3 = %d\n", a + 1, a + 2, a + 3);
  }
}
