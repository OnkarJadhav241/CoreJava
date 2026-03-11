package swtichcasepractice;

public class SeasonBasedonMonth {

	public static void main(String[] args) {
		String month = "Jan";
		switch (month) {
		case "Dec", "Jan", "Feb":
			System.out.println("Winter");
			break;
		case "Mar", "Apr", "May":
			System.out.println("  Summer");
			break;
		case "Jun", "Jul", "Aug", "Sep":
			System.out.println("Monsoon");
			break;
		case "Oct", "Nov":
			System.out.println("Autumn");
			break;
		default:
			System.out.println("Invaild Inputs .....!");
		}

	}

}
