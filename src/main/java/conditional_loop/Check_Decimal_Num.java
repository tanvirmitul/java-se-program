package conditional_loop;

// Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241

import java.util.Scanner;

public class Check_Decimal_Num {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter number 1: ");
    double num1= input.nextDouble();
    System.out.print("Enter number 2: ");
    double num2= input.nextDouble();

    if(num1==num2){
      System.out.println("They are both same");
    }
    else{
      System.out.println("They are different up to two decimal places");
    }

  }
}
