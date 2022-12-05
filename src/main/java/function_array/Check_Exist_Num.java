package function_array;

// Take input from a user and check if the number exists in the array
// let the array is [1,3,5,7,2,4,6,8]
// Input: 7
// Output: Found in the position 3
// Input: 9
// Output: Found no element

import java.util.Scanner;

public class Check_Exist_Num {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int[]a={1,3,5,7,2,4,6,8};
    int count=0;

    System.out.print("Enter element: ");
    int num= input.nextInt();

    for(int i=0;i<a.length;i++){
      if(num==a[i]){
        System.out.println("Element found at position "+i);
      }
      else{
        count++;
      }
    }
    if(count==a.length){
      System.out.println("No element found");
    }
  }
}
