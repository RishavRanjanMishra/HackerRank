package Day3;

import java.util.*;

public class Intro_to_Conditional_Statements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        scan.close();
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==0){
            if( n >= 2  && n <=5){
                System.out.println("Not Weird");
            }

            if( n >= 6  && n <= 20){
                System.out.println("Weird");
            }

            if( n > 20){
                System.out.println("Not Weird");
            }
      }
      else{
         System.out.println("Weird");
         // Complete the code 
      }
   }
}