package Day6; 

import java.util.*;

public class Lets_Review {
	public static void main(String[] srgs) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			String s = sc.next();
            String s_even = "";
            String s_odd = "";
            for(int j=0; j<s.length(); j++) {
            	if(j%2 == 0) {
            		s_even = s_even+ s.charAt(j);
            	}
            	else {
            		s_odd = s_odd + s.charAt(j);
            	}
            }
            System.out.println(s_even +" "+ s_odd);
		}
	}
}