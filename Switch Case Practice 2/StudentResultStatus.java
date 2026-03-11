package swtichcasepractice;

public class StudentResultStatus {

	public static void main(String[] args) {
		char grade = 'A';
		switch (grade) {

		case 'A','a':
			System.out.println(" Distinction");
			break;
		case 'B','b':
			System.out.println(" First Class");
			break;
		case 'C','c':
			System.out.println("Second Class");
			break;
		case 'D','d':
			System.out.println("Pass ");
			break;
		case 'F','f':
			System.out.println("Fail  ");
			break;
		default:
			System.out.println("Invalid Input");
		}
		
		
	}

}
