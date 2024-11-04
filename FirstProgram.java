

public class FirstProgram {
    public static void main(String[] args) {

        // Java Program
        String name = "Harsha";
        int age = 13;
        float price = 5.00f;
        float price_of_1_toy = price / 10;
        int toys = 50;
        int grade = 8;
        float gpa = 4.0f;

        int x = 5;
        int y = 15;
        System.out.println("Hello World");
        System.out.println("Welcome to Java");
        System.out.println("Harsha First Java Program");
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am in grade " + grade + ".");
        System.out.println("My gpa is " + gpa + ".");
        System.out.println("The price of 10 toys are " + price);
        System.out.println("The price of 1 toy is " + price_of_1_toy + ".");

        System.out.println("x = " + x + " y = " + y);

        // Addition
        int addition_result = x + y;
        System.out.println("Addition : " + addition_result);

        //Subtraction
        int subtraction_result = y - x;
        System.out.println("Subtraction : " + subtraction_result);

        // Multiplacation
        int multiplacation_result = x + y;
        System.out.println("Multiplacation : " + multiplacation_result);

        //Division
        int division_result = y - x;
        System.out.println("Division : " + division_result);


        toys = toys + 10;
        System.out.println("I have " + toys + " toys.");

        toys = toys - 10;
        System.out.println("Now, I have " + toys + " toys.");

        int num = 6;

        if(num>=3 && num<=5){
            System.out.println("True");
        } else {
            System.out.println("Number is greater or less than 3 or 5");
        }

        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        for(int i=10; i>=1; i--){
            System.out.println(i);
        }

        int i = 0;

        while(i <= 20){
            System.out.println(i);
            i++;
        }
    }
}