import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = input.nextLine();

        System.out.println("Enter your age : ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your height in inches: ");
        double height = input.nextFloat();
        input.nextLine();

        System.out.println("Hello "+name+"!");
        System.out.println("You are "+age+" years old.");
        System.out.println("You are "+height+" inches tall.");


    }
}