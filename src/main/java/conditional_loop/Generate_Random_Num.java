package conditional_loop;
// Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.

import java.util.Random;
import java.util.Scanner;

public class Generate_Random_Num {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int count=0;

    for(int i=1;i<=10;i++){
      System.out.println("Enter num: ");
      int guessNum= input.nextInt();

      Random ran1=new Random();
      Random ran2=new Random();

      int randomNum1=ran1.nextInt(10);
      int randomNum2=ran2.nextInt(10);

      if(guessNum==randomNum1 || guessNum==randomNum2){
        System.out.println("Correct!");
        count++;
      }

    }
    System.out.println("Total point "+count);
  }
  
}
