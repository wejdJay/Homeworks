import java.util.ArrayList;
import java.util.Scanner;

public class ForthDex {
    public static void main(String[] args) {

        //Ex(1), this part will print every score in this array with its grade.
        int [] Gnums={50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};
        for(int v=0;v<=Gnums.length-1;v++){

            if (Gnums[v]>=95 && Gnums[v]<=100){
                System.out.println("Your score is:"+"("+Gnums[v]+")"+ " with grade A+.");
            }
            else if(Gnums[v]>=90&&Gnums[v]<=94){
                System.out.println("Your score is:" +"("+Gnums[v]+")"+ " with grade A.");
            }
            else if(Gnums[v]>=85&&Gnums[v]<=89){
                System.out.println("Your score is:" +"("+Gnums[v]+")"+ " with grade B+.");
            }
            else if(Gnums[v]>=80&&Gnums[v]<=84){
                System.out.println("Your score is:" +"("+Gnums[v]+")"+ " with grade B.");
            }
            else if(Gnums[v]>=75 && Gnums[v]<=79){
                System.out.println("Your score is:" +"("+Gnums[v]+")"+ " with grade C+.");
            }
            else if(Gnums[v]>=70 && Gnums[v]<=74){
                System.out.println("Your score is:" +"("+Gnums[v]+")"+ " with grade C.");
            }
            else if(Gnums[v]>=65 && Gnums[v]<=69){
                System.out.println("Your score is:" +"("+Gnums[v]+")"+ " with grade D+.");
            }
            else if (Gnums[v]>=60 && Gnums[v]<=64){
                System.out.println("Your score is:" +"("+Gnums[v]+")"+ " with grade D.");
            }
            else{
                System.out.println("Your score is:" +"("+Gnums[v]+")"+ " with grade F.");
            }

        }

        System.out.println("--------------------------------------------------------- ");

        //Ex(2), this part will print every name starts with the letter A.
        String [] SName = {"Shaza","Mohammed","Asmaa","Anfal","Yousra","Amin","Radwa","yasmeen"};
        for(String n:SName){
            if (n.startsWith("A"))
            {
                System.out.println(n);
            }
        }

        System.out.println("--------------------------------------------------------- ");

        //Ex(3),this part will print only numbers larger than 50.
        int[] nums = {50, 60, 40, 10, 38, 65, 87, 56, 90, 100, 66, 80, 88, 40, 98};
        for (int n : nums) {
            if (n > 50)
            {System.out.println(n);}
        }

        System.out.println("--------------------------------------------------------- ");

        //Ex(4),this part will take an integer from user and check if it's exist in the array or not.
        Scanner usin = new Scanner(System.in);
        System.out.println("Please enter any number here to check: ");
        int check = usin.nextInt();
        ArrayList <Integer> defNums = new ArrayList<Integer>();
        defNums.add(10);
        defNums.add(20);
        defNums.add(30);
        defNums.add(40);
        defNums.add(50);
        defNums.add(60);
        defNums.add(70);
        defNums.add(80);
        defNums.add(90);
        defNums.add(100);
        if(defNums.contains(check)){
            System.out.println("Number "+"("+check+")"+" you have entered has been found successfully.");
        }
        else  {
            System.out.println("Number "+"("+check+")"+" you have entered has been not found");
        }

        }

    }