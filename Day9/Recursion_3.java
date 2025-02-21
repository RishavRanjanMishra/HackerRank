package Day9;

import java.io.*;

class Solution {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
    // Write your code here
    if(n<=1) {
        return 1;
    } else {
        return n*factorial(n-1);
        }
    }

	public void pushCharacter(char c) {
		// TODO Auto-generated method stub
		
	}
}

public class Recursion_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        System.out.print("Enter number: ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("number: " + n);
        

        int result = Solution.factorial(n);
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}