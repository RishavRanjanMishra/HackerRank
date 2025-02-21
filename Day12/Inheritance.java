package Day12;

import java.util.*;

public class Inheritance {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Inheritance(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printInheritance(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
}

class Student extends Inheritance{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate(){
        int total = 0;
        double average;
        for(int i = 0; i < testScores.length; i++){
            total += testScores[i];
        }
        char ans;
        average = (double)total / testScores.length;
        if(average <= 100 && average >= 90.0){
            ans = "O".charAt(0);
        }else if(average < 90 && average >= 80){
            ans = "E".charAt(0);
        }else if(average < 80 && average >= 70){
            ans = "A".charAt(0);
        }else if(average < 70 && average >= 55){
            ans = "P".charAt(0);
        }else if(average < 55 && average >= 40){
            ans = "D".charAt(0);
        }else{
            ans = "T".charAt(0);
        }
        return ans;
    }
}

class Person {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printInheritance();
		System.out.println("Grade: " + s.calculate());
	}
}