import java.util.Scanner;

public class t2p19 {
  public static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    int a, b, c;
    System.out.print("Write your number: ");
    a = reader.nextInt();
    b = a - 1;
    c = a + 1;
    System.out.println(b + " " + a + " " + c);
  }
}
