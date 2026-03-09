package ifelsepracticeset;

//Write a program to check whether a person is eligible for a loan.
//Conditions :
//Age ≥ 21
//Salary ≥ 25000

public class loan {

	public static void main(String[] args) {
		int age = 21;
		double salary = 25000;

		if (age >= 21) {
			System.out.println("According to your age You are Eligible of loan");
			if (salary >= 25000) {
				System.out.println("Loan Approved ...!");
			} else {
				System.out.println("Your Salary is not fulfilled for a LOAN ,SORRY UR NOT ELIGIBLE ... ! ! ");
			}
		} else {
			System.out.println(" Your age is not fulfilled for a LOAN ,SORRY UR NOT ELIGIBLE ... !");
		}

	}

}
