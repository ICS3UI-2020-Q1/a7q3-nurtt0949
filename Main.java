import java.util.Scanner;
/**
 *Prints random amount of stars
 * @author Tolga Nurtekin
 */
public class Main {
   //method for random amount of stars between 1 and 5
   public static void chaotic(int userNum){
    
    //loop for amount of stars
    for(int i = 1; i <= userNum; i++){
      int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
       for(int k = 1; k <= randNum; k++){
        System.out.print("*");
      }
      System.out.println();

    }
   }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
    //ask user for number 
    System.out.println("Enter number");
    //declare a variable to store the number
    int userNum = input.nextInt();
    chaotic(userNum);
    
  }
}
