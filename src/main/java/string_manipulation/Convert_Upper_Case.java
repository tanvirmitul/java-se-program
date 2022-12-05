package string_manipulation;

// Write a program to convert each 1st char to uppercase from a string. Input: rahim lives in sylhet Output: Rahim Lives in Sylhet

public class Convert_Upper_Case {
  public static void main(String[] args) {

    String str="rahim lives in sylhet";
    String[]ab=str.split(" ");

    for(int i=0;i<ab.length;i++){
      char bc=ab[i].toUpperCase().charAt(0);
      String b=ab[i].substring(1);
      System.out.print(bc+b+" ");
    }
    }
  
}
