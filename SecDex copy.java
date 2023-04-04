import java.util.Scanner;
public class SecDex {
    public static void main(String []args){

        Scanner userInput = new Scanner (System.in);
        //Exercise (1), to show the state of the user number he entered.

        System.out.println("Please enter your number to check: ");
        int userVal = userInput.nextInt();
       if (userVal > 0){
           System.out.println("You entered "+"("+userVal+")"+" and it's a positive number.");
       }
       else if (userVal<0){
           System.out.println("You entered "+"("+userVal+")"+" and it's a negative number.");
       }
       else {
           System.out.println("You entered "+"("+userVal+")"+" and it's equals to ZERO.");
       }

        System.out.println("--------------------------------------------------------- ");

        //Exercise (2), to print the letter that the user number indicates to.

        Scanner userIn2 = new Scanner (System.in);
        System.out.println("Please enter your full name: ");
        String UserFname= userIn2.nextLine();
        System.out.println("Please enter a number: ");
        int UserNum= userIn2.nextInt();
        System.out.println("Hi "+UserFname +
                ", you entered "+UserNum+" which is indicates to the letter: " +"'"+ UserFname.charAt(UserNum)+"'.");


        System.out.println("--------------------------------------------------------- ");
       // Exercise (3), this part will check if the user course contains user's letter or not.

        Scanner userIn3 = new Scanner (System.in);
        System.out.println("Enter your course name: ");
        String UserCour = userIn3.nextLine();
        System.out.println("Enter your character to check: ");
        char UserCha = userIn3.next().charAt(0);

        if (UserCour.contains(""+UserCha+"")){
            System.out.println( "Your letter " +"'"+UserCha+"'"+ " is found");

        }
       else{
            System.out.println( "Is your letter " +"'"+UserCha+"'"+ " isn't found");
        }



        System.out.println("--------------------------------------------------------- ");
//        //Exercise (4), this will take 3 numbers from user and print the largest number.

        Scanner userIn4 = new Scanner (System.in);
        System.out.println("Please enter the first number: ");
        int N1= userIn4.nextInt();
        System.out.println("Please enter the second number: ");
        int N2= userIn4.nextInt();
        System.out.println("Please enter the third number: ");
        int N3= userIn4.nextInt();
        if(N1>N2 && N1>N3){
            System.out.println("Your first number "+"("+N1+")"+ " is the largest number.");
        }
        else if (N2>N1 && N2>N3){
            System.out.println("Your second number" +"("+N2+")"+ " is the largest number.");
        }
        else {
            System.out.println("Your third number " +"("+N3+")"+ " is the largest number.");
        }


    }
}
