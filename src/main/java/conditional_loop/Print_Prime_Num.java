package conditional_loop;

// Write  a program to find the factorial of a given number

import java.util.Scanner;

public class Print_Prime_Num {
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    System.out.println("Enter limit: ");
    int limit= input.nextInt();

    for(int i=2;i<=limit;i++){
      int count=0,point=0;
      for(int j=2;j<=i/2;j++){
        if(i%j==0){
          count++;
          break;
        }
     }
     if(count==0 && i!=1){
      System.out.println("Prime num is: "+i);
     }
    }
  }
}
