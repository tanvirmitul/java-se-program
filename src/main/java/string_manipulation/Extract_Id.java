package string_manipulation;

//  Extract the transaction ID from the HTML body
// <html>
// <title>Test</title>
// <body>
// Your trnx is successful. Trnx Id is: TXN123456
// </body>
// </html>
// Output: TXN123456

public class Extract_Id {
  public static void main(String[] args) {
    String str="<html>\n"+ 
    "<title>Test</title>\n"+
"<body>\n"+
"Your trnx is successful. Trnx Id is: TXN123456\n"+
"</body>\n"+
"</html>";

int ab=str.indexOf("TXN");
String ind=str.substring(71, 80);
System.out.println(ind);
  }
}
