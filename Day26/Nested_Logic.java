import java.util.*;

public class Nested_Logic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int a_day = sc.nextInt();
        int a_month = sc.nextInt();
        int a_year = sc.nextInt();
        
        int e_day = sc.nextInt();
        int e_month = sc.nextInt();
        int e_year = sc.nextInt();
        
        int fine = 0;
        
        if(a_year < e_year)
        {
            fine = 0;
        }
        else {
            if(a_year > e_year)
            {
                fine = 10000;
            }
            else if(a_month > e_month)
            {
                fine = 500*(a_month - e_month);
            }
            else if(a_day > e_day)
            {
                fine = 15*(a_day - e_day);
            }
        }
        System.out.println(fine);
    }
}