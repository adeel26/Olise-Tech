import java.util.Scanner;

public class SwitchStat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch(fruit){
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Banana":
                System.out.println("Yellow colour");
                break;
            default:
                System.out.println("Not recognized");
        }
    }
}
