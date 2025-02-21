package Day18;

import java.util.*;

public class Queues_and_Stacks {
    // Write your code here.
    Stack<Character> st = new Stack<>();
    Queue<Character> q = new LinkedList<>();
    void pushCharacter(char ch) {
        st.push(ch);
    }
     void enqueueCharacter(char ch) {
        q.add(ch);
     }
     char popCharacter() {
        return st.pop();
     }
     char dequeueCharacter() {
        return q.remove();
     }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Queues_and_Stacks p = new Queues_and_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}