package oopspractical;

import java.util.Scanner;

public class bitwise {
  public static class Test {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      
      System.out.print("Enter integer value for a: ");
      int a = input.nextInt();

      System.out.print("Enter integer value for b: ");
      int b = input.nextInt();

      int c;

      
      c = a & b;
      System.out.println("a & b = " + c);


      c = a | b;
      System.out.println("a | b = " + c);

      input.close();
    }
  }
}