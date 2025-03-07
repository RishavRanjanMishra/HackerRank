package Day11;

import java.util.*;

public class Arrays_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maxval = -9*6;
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sum += arr[i+1][j+1];
                sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sum>maxval) {
                    maxval = sum;
                }
            }
        }
        System.out.println(maxval);
    }
}