package string_manipulation;

// Writea program that will give following output:
// Input: chattogram
// Output: C8M

public class Print_Output {
  public static void main(String[] args) {
    String str="chattogram";

    char c=str.toUpperCase().charAt(0);
    char m=str.toUpperCase().charAt(9);
    String ab=String.valueOf(str.length()-2);

    String abc=c+ab+m;
    System.out.println(abc);

  }
  
}
