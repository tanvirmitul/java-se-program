package string_manipulation;

// Write a program that will count how many vowels in the given string: "roadtosdet"

public class Count_Vowel {
  public static void main(String[] args) {
    String str="roadtosdet";
    int count=0;

    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        count++;
      }
  }
  System.out.println("Total vowels are: "+count);
}
}
