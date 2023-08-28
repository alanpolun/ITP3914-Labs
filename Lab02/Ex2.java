import java.util.Scanner;
public class Ex2 {
   public static void main( String[] args ) {
      // Create a Scanner object for console input
      Scanner input = new Scanner(System.in);
      // Declare variables
      double n, j, result;
      System.out.println( "This is a template  program for console I/O." );
      System.out.print( "Enter n: " );
      n = input.nextDouble();  // input a double from keyboard
      System.out.print( "Enter j: " );
      j = input.nextDouble();  // input a double from keyboard
      result  = n + j;
      System.out.println( "result = " + result );
   } 
}
