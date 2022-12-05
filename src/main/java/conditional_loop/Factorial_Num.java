package conditional_loop;

// Write  a program to find the factorial of a given number


import java.util.Scanner;

public class Factorial_Num {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int sum=1;
    System.out.print("Enter num: ");
    int factnum=input.nextInt();

    for(int i=1;i<=factnum;i++){
      sum=sum*i;
    }
    System.out.println(factnum +" factorial is "+sum);

  }
  
}
