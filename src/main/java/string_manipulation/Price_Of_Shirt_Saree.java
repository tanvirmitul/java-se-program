package string_manipulation;

// Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?

import java.util.Scanner;

public class Price_Of_Shirt_Saree {
  public static void main(String[] args) {
    String str="Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";

    String b=str.replaceAll("[^\\d]", " ");
    String c=b.trim();
    String d=c.replaceAll(" +", " ");
    String[] ab=d.split(" ");
   
    int shirtPrize=Integer.parseInt(ab[0]);
    int sareePrize=Integer.parseInt(ab[1]);
    int shirtQuantity=Integer.parseInt(ab[2]);
    int sareeQuantity=Integer.parseInt(ab[3]);
    int discountMoney=Integer.parseInt(ab[4]);

    Scanner input= new Scanner(System.in);
    System.out.println("Enter shirt quantity: ");
    int pshirtquantity=input.nextInt(); 
    System.out.println("Enter saree quantity: ");
    int psareequantity=input.nextInt();
    int totalPrize;

    if(pshirtquantity==2 && psareequantity==1){
      totalPrize=((shirtQuantity*shirtPrize)+(sareeQuantity*sareePrize))-discountMoney;
      System.out.println(totalPrize);
    }
    else{
      totalPrize=(pshirtquantity*shirtPrize)+(psareequantity*sareePrize);
      System.out.println("Total prize: "+totalPrize);
    }

  }
  
}
