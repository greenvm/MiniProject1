// Victoria Green
import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive number");

    Random r = new Random();
    Scanner s = new Scanner(System.in);

    int userNum = s.nextInt(); 
    int randomNum = r.nextInt(5);

    System.out.println("A random number to guess has been generated");

    
  }
}