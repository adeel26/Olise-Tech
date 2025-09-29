import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        // take input of two numbers and print the sum
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();

        Sum(num1, num2);
    }
    
    static void Sum(int aaa, int bbb){
        int sum = aaa + bbb;
        System.out.println("The Sum is " + sum);
    }
}
