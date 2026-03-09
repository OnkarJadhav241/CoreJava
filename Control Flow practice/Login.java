package ifelsepracticeset;

//Write a program to check login authentication (username and password).

public class Login {

	public static void main(String[] args) {

		String username = "Shivam";
		String password = "Shivam12";

		if (username == "Shivam" && password == "Shivam12") {
			System.out.println("Login Successful ...!");
		} else {
			System.out.println("Invalid Credentials.....!");
		}

	}

}
