package string_manipulation;

// Find out how many images are in the given array:["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]

public class Find_Image {
  public static void main(String[] args) {
    String[]str={"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};
    int count=0;
    for(int i=0;i<str.length;i++){
      if(str[i].contains("jpg") ||str[i].contains("png") ){
        count++;
      }
    }
    System.out.println("Total output "+count);
  }
  
}
