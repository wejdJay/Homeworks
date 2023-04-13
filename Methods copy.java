import java.util.Scanner;
//a program to calculate user's age.
public class Methods {
    public static void main(String []args){
        Scanner userInput = new Scanner (System.in);
        System.out.println("Please enter your full name: ");
        String userName = userInput.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("Now, enter your born year: ");
        int userAge = userInput.nextInt();
        calcAge(userName, userAge);

    }

    //here is a method that doesn't return any value to the main method.
    static void calcAge(String name , int age){
        int currentYear= 2023;
        int bornYear= age;
        int realAge= currentYear - bornYear;
        System.out.println(name +" you are "+realAge+" years old.");
    }
}
