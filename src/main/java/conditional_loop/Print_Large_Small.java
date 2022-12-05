package conditional_loop;

// Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.

import java.util.Scanner;

public class Print_Large_Small {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int maxnum=Integer.MIN_VALUE, minnum=Integer.MAX_VALUE;

    for(int i=1;i>0;i++){
      System.out.println("Enter num: ");
      int num=input.nextInt();

      if(num>maxnum){
        maxnum=num;
      }
      if(num<minnum){
        minnum=num;
      }
      System.out.println("Enter c for continue q for quit");
      System.out.println("Enter choice: ");
      char ch=input.next().charAt(0);
      if(ch=='q'){
        break;
      }
      if(ch=='c'){
        continue;
      }
    
    }
    System.out.println("Large number is: "+maxnum);
    System.out.println("Small num is: "+minnum);
  }
  
}
