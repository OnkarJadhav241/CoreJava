package switchcase;

public class MobileSettingMenu {

	public static void main(String[] args) {
		int choice = 4;
		switch (choice) {
		case 1:
			System.out.println("WiFi");
			break;
		case 2:
			System.out.println(" Bluetooth");
			break;
		case 3:
			System.out.println("Mobile Data");
			break;
		case 4:
			System.out.println("Airplane Mode");
			break;
		default:
			System.out.println("Invaild Inputs .....!");

		}
	}

}
