package Day5;

import java.util.*;

public class Loops {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1; i<=10; i++) {
            int output = N*i;
        System.out.println(N +" "+ "x" + " "+ i + " " + "=" +  " " + output);
        }
    }
}