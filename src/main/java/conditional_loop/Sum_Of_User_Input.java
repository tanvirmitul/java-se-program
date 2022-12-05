package conditional_loop;

// Write a program to sum of user input until users input ‘q’ from keyboard

import java.util.Scanner;

public class Sum_Of_User_Input {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    char ch='a';
    int sum=0;
    while(ch!='q'){
      System.out.println("Enter num: ");
      int num= input.nextInt();

      sum+=num;

      System.out.println("Enter c for continue & q for quit");
      System.out.println("Enter choice: ");
      ch= input.next().charAt(0);
    }
    System.out.println("Total sum is: "+sum);
  }
  
}
