import java.util.*;

public class t2p13 {
  static Scanner reader = new Scanner(System.in); 
  public static void main(String[] args) {
    System.out.print("Write your first number: ");
    int a = reader.nextInt();
    System.out.print("Write your second number: ");
    int b = reader.nextInt();
    System.out.printf("Sum of numbers is %d\n", a + b);
    System.out.printf("First number * 2 = %d\n", a * 2);
    System.out.printf("Second number * 3 = %d\n", b * 3);
    System.out.printf("First number * 10 * second number is %d\n", a * 10 + b);
    System.out.printf("First number / 3 = %d\n", a / 3);
  }
}
