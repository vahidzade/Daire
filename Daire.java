import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		switch (a) {
		case 1:
			System.out.println("a 1 beraberdir");
			break;
		case 2:
			System.out.println("a 2 beraberdir");
			break;
		default:
			System.out.println("a 3 beraberdir");
		}
		
		
		

	}

}
  
