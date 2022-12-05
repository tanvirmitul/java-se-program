
package conditional_loop;

// Write a program to check if inputted letter is small or capital


import java.util.Scanner;

public class Letter_Small_Capital {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter letter: ");
    char let= input.next().charAt(0);

    if(let>='A' && let<='Z'){
      System.out.println("Input letter is Capital");
    }
  else if(let>='a' && let<='z'){
      System.out.println("Input letter is small");
    }
    else{
      System.out.println("Wrong Input!");
    }
  }
  
}
