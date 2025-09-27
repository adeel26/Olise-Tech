import java.util.Scanner;

public class AdvSwitch{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String name = input.next();

		switch (name){
			case "Adeel" -> System.out.println("Hi Adeel");
            		case "Iqbal" -> System.out.println("Hi Iqbal");
            		default -> System.out.println("Hello");
		}


	}
	

}
