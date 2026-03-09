package ifelsepracticeset;


//Write a program to display grade based on marks.
//Example condition:
//Marks ≥ 75 → Distinction
//Marks ≥ 60 → First Class
//Marks ≥ 50 → Second Class
//Marks ≥ 35 → Pass
//Otherwise → Fail

public class GradeSystem {

	public static void main(String[] args) {
		int marks = 84;
		
		if (marks<=100 && marks>=75) {
			System.out.println("You get a Distinction...!");
		}else if (marks<75 && marks>=60) {
			System.out.println("You get a First Class...!");
		}else if (marks<60 && marks>=50) {
			System.out.println("You get a Second Class...!");
		}else if (marks<50 && marks>=35) {
			System.out.println("You has Passed the exam.");
		}else {
			System.out.println(" Fail...!");
		}

	}

}
