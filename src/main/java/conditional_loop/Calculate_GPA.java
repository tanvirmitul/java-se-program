
package conditional_loop;

// Write a program to calculate GPA and find grade

import java.util.Scanner;

public class Calculate_GPA {
  
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    System.out.println("Enter total subject: ");
    int totalSub=input.nextInt();
    int totalNum=0;
    double avg;

    System.out.println("Enter the marks of subject: ");
    for(int i=1;i<=totalSub;i++){
      int marks=input.nextInt();
      totalNum=totalNum+marks;
    }
    avg=totalNum/totalSub;
    System.out.println("Your GPA is: "+avg);

    if(avg>80){
      System.out.println("Your grade is A+");
    }
    if(avg>=70 &&avg <=79) {
      System.out.println("Your grade is A");
    }
     if(avg>=65 &&avg <=69) {
      System.out.println("Your grade is A-");
    }
    if(avg>=60 &&avg <=64) {
      System.out.println("Your grade is B+");
    }
    if(avg>=55 &&avg <=59) {
      System.out.println("Your grade is B");
    }
    if(avg>=50 &&avg <=54) {
      System.out.println("Your grade is B-");
    }
    if(avg>=45 &&avg <=49) {
      System.out.println("Your grade is C");
    }
    if(avg>=40 &&avg <=44) {
      System.out.println("Your grade is D");
    }
    if(avg>=0 &&avg <=39) {
      System.out.println("Your grade is F");
    }
        
}
}
