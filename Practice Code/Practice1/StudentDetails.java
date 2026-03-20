package classandobjectpractice;

public class StudentDetails {

	public static void main(String[] args) {
		Student stud1 =new Student();
		stud1.id=101;
		stud1.name ="Onkar";
		
		System.out.println("ID :- " + stud1.id);
		System.out.println("Name :- "+stud1.name);
		
		Student stud2 =new Student();
		stud2.id=102;
		stud2.name ="Shivam";
		
		System.out.println("ID :- " + stud2.id);
		System.out.println("Name :- "+stud2.name);

	}

}
