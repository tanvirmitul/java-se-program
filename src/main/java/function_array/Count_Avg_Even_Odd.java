package function_array;

// Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()

import java.util.Scanner;

public class Count_Avg_Even_Odd {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

    int[]arr=new int[5];
    System.out.println("Enter array: ");

    for(int i=0;i<arr.length;i++){
      arr[i]=input.nextInt();
    }
    Average(arr);
    countEvenNumbers(arr);
    countOddNumbers(arr);

   
  }
   public static void Average(int []num) {
      double avg;
      int sum=0;
      for(int i=0;i<num.length;i++){
        sum+=num[i];
      }
      avg= sum/num.length;
      System.out.println("Average num is: "+avg);

    }
    public static void countEvenNumbers(int[]num) {
      int count=0;
      for(int i=0;i<num.length;i++){
        if(num[i]%2==0){
          count++;
        }
      }
      System.out.println("Total Even number is "+count);
    }
    public static void countOddNumbers(int[]num) {
      int count=0,odd=0;
      
      for(int i=0;i<num.length;i++){
        if(num[i]%2==0){
          count++;
        }
        else{
          odd++;
        }
      }
      System.out.println("Total Even number is "+odd);
    }
  
}
