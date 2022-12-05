package function_array;

//  Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.

import java.util.HashMap;
import java.util.Scanner;

public class Bazar_List {
  public static void main(String[] args) {
    HashMap <String, Integer> bazarList= new HashMap<>();
    bazarList.put("Rice", 55);
    bazarList.put("Oil", 190);
    bazarList.put("Sugar", 160);
    bazarList.put("Salt", 35);
    searchItem(bazarList);
    int totalSum=totalSum(bazarList);
    System.out.println("Total prices of the items are: "+totalSum);
  }

  public static void searchItem(HashMap <String, Integer> goodsList) {
    Scanner input= new Scanner(System.in);

    System.out.print("Enter item: ");
    String item=input.nextLine();

    if(goodsList.keySet().contains(item)){
      System.out.println("Price of the item is: "+goodsList.get(item));
    }
    else{
      System.out.println("No item found");
    }
  }
  public static int totalSum(HashMap <String, Integer> goodsList) {
    int sum=0;

    for(int x: goodsList.values()){
      sum+=x;
    }
    return sum;
    
  }
  
}
