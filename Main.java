import java.util.Scanner;

/**
 *
 * @author Cesar Gil
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // To convert a temperature from Celsius to Fahrenheit

    Scanner input = new Scanner(System.in);
    System.out.println("Please give tempture you would like converted from Celsius to Fahrenheit");
    
    int degrees = input.nextInt();
    int Fahrenheit = ((degrees*9)/5 +32);
    
    System.out.println(degrees + "C is equal to " + Fahrenheit + "F");
    
  }
}
