package function_array;

// Suppose, in a company , here are some employee salaries in an array
// [35000, 25000, 28000, 32500, 44000, 32800]
// Find out the 3rd highest salary

import java.util.Scanner;

public class Third_Highest_Sal {
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);

    int []sal={35000, 25000, 28000, 32500, 44000, 32800};

    int maxNum1=Integer.MIN_VALUE;
    int maxNum2=Integer.MIN_VALUE;
    int maxNum3=Integer.MIN_VALUE;

    for(int i=0;i<sal.length;i++){
      if(sal[i]>maxNum1){
        maxNum1=sal[i];
      }
    }
    for(int i=0;i<sal.length;i++){
      if(sal[i]!=maxNum1)
      if(sal[i]>maxNum2){
        maxNum2=sal[i];
      }
    }
    for(int i=0;i<sal.length;i++){
      if(sal[i]!=maxNum1 && sal[i]!=maxNum2)
      if(sal[i]>maxNum3){
        maxNum3=sal[i];
      }
    }
    System.out.println("Third highest salary is: "+maxNum3);
  }
  
}
