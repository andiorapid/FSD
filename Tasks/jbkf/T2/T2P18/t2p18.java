import java.util.*;

public class t2p18 {
  static Scanner reader = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Write your number: ");
    int a = reader.nextInt();
    System.out.printf("Result = %d&%x\n", a * a, (int)Math.pow(a, 3));
  }
}
