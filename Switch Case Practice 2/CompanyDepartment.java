package swtichcasepractice;

public class CompanyDepartment {

	public static void main(String[] args) {
		int choice = 2;
		switch (choice) {
		case 1:
			System.out.println("HR");
			break;
		case 2:
			System.out.println("Finance");
			break;
		case 3:
			System.out.println("IT");
			break;
		case 4:
			System.out.println("Marketing");
			break;
		default:
			System.out.println("Invaild Inputs .....!");
		}

	}

}
