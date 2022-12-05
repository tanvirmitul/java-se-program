package string_manipulation;

// Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

public class Calculate_Laptop_Prize {
  public static void main(String[] args) {
    String str="Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
    String b=str.replaceAll("[^\\d]", " ");
    String c=b.trim();
    String d=c.replaceAll(" +", " ");
    String []j=d.split(" ");

    int laptopPrize=Integer.parseInt(j[1]);
    double discount=Double.parseDouble(j[2]);
    double totaldiscount;
    totaldiscount=laptopPrize*(discount/100);
    double totalprize=laptopPrize- totaldiscount;
    System.out.println("Total purchase prize: "+(int)totalprize); 
   
  }
  
}
