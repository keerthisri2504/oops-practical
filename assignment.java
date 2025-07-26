package oopspractical;

import java.util.Scanner;

public class assignment {
  static class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

     
      System.out.print("Enter value for a: ");
      int a = input.nextInt();

      int var;

      
      var = a;
      System.out.println("var using =: " + var);

      var += a;
      System.out.println("var using +=: " + var);

      var *= a;
      System.out.println("var using *=: " + var);

      input.close();
    }
  }
}