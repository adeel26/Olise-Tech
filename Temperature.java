import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Temperature in Celsius");
        float celsiusTemp = input.nextFloat();
        float fahrenheitTemp = (celsiusTemp * 9/5) + 32;
        System.out.println(fahrenheitTemp);
    }
}
