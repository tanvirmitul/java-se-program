package function_array;

//  Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin, password: adm1n

import java.util.Scanner;

public class Three_Times_Password {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
     
     String username="admin", password= "adm1n";
     int count=0;

  for(int i=1;i>0;i++){
    System.out.println("Enter your email");
    String enteredEmail=input.nextLine();
    System.out.println("Enter your password");
    String enteredPassword=input.nextLine();

    if(username.equals(enteredEmail) && password.equals(enteredPassword)){
     System.out.println("Welcome to the system!");
      break;
    }
    if(enteredPassword!=password){
     
        count++;
        if(count==1){
                  System.out.println("Wrong password");

        }
      else  if (count==2){
          System.out.println("You've entered wrong password for two times! if you enter again for 3 times.Your account will be temporary locked ");
        }
        else{
          System.out.println("Your account will be temporary locked ");
          break;
        }
    }
  
  }

  }

}
