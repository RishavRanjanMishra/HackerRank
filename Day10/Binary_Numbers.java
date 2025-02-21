import java.util.*;

public class Binary_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int max = 0;
        
        while(n!=0) {
            if(n%2 == 0) {
                count = 0;
            } else {
                count++;
                if(count > max)
                {
                    max = count;
                }
            }
            n = n/2;
        }
       System.out.println(max);
    }
}