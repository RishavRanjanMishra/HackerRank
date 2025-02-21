package Day25;

import java.util.*;

public class Running_Time_and_Complexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int m = sc.nextInt();
            int c = 0;
            
            if(m==1)
            {
                System.out.println("Not prime");
            }
            else {
                for(int j=2; j<=Math.sqrt(m); j++)
                {
                    if(m%j == 0)
                    {
                        c = c+1;
                    }
                }
                if(c == 0)
                {
                    System.out.println("Prime");
                }
                else {
                    System.out.println("Not prime");
                    c=0;
                }
            }
        }
    }
}