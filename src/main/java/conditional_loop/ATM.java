package conditional_loop;

// Write a program to check balance and withdraw money from ATM booth using if else or switch case

import java.util.Scanner;

public class ATM {
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    double amount=12500.00, newAmount=0.00;

    System.out.println("Menu");
    System.out.println("1. Check Balance");
    System.out.println("2. Withdraw Balance");
    System.out.println("3. Deposit Balance");
    System.out.println("4. Exit");

    System.out.print("Enter your choice: ");
    int choice= input.nextInt();
    if(choice==1){
      System.out.println("Your current balance is: "+amount);
    }
    else if(choice==2){
      System.out.println("Enter your withdraw balance: ");
      double withDrawAmount= input.nextDouble();
      if(withDrawAmount<amount){
        newAmount=amount-withDrawAmount;
        System.out.println("Your withdraw amount is: "+withDrawAmount);
        System.out.println("Your current amount is: "+newAmount);
      }
      else{
        System.out.println("You're beyond the limits");
      }
    }
    else if(choice==3){
      System.out.println("Enter your deposit balance: ");
      double depositBalance=input.nextDouble();
      newAmount=amount+depositBalance;
      System.out.println("Your current balance is: "+newAmount);

    }
    else if(choice==4){
      System.out.println("Thank you for using our service");
    }
    else{
      System.out.println("Wrong input!!ENter correct input");
    }


  }
  
}
