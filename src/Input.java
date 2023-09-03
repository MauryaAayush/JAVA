import java.util.Scanner;


public class Input {
    public static void main(String [] args)
    {



        byte num1 = 121;

        short num2 = 10999;

        int salary_of_me = 35000;

        long phone = 9825486060L;

        float percentageOfDarshan = 98.52f;

        double random = 456123.456123;

        boolean isLogin = true;

        String name;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num1 : ");
        num1 = input.nextByte();
        System.out.print("Enter your salary : ");
        salary_of_me = input.nextInt();
        System.out.print("Write your name : ");
        name = input.next();


    }
}
