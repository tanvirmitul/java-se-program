package conditional_loop;

// Write a program to sum of numbers which only divisible by 5 from 1 to 100

public class Sum_Of_Num_Divi_By_5 {
  public static void main(String[] args) {

    int sum=0,sum1=0;
    
    for(int i=1;i<=100;i++){
      if(i%5==0){
        sum+=i;
      }
    }
    System.out.println("Total sum is: "+sum);
  }
  
}
