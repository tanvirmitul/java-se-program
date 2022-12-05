package function_array;

//  Input an amount from the user and find out the number of notes from input amount in given array
// [1000,500,100,50,20,10,5,2,1]
// Input: 1256
// Output: 
// 1000 1
// 100 2
// 50 1
// 2 3

import java.util.Scanner;

public class Count_Note {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    int []a={1000,500,100,50,20,10,5,2,1};

    System.out.println("Enter amount: ");
    int amount=input.nextInt();

    for(int i=0;i<a.length;i++){
      System.out.println(a[i]+" note is "+amount/a[i]);
      amount=amount%a[i];
    }
  }
  
}
