public class ThirdDex {
    public static void main (String[]args) {
        //Ex1, to print all numbers from 1-100 and declare the even numbers among them.
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0)
            {System.out.println(i+ "-> Is even number");}
            else{System.out.println(i);}
        }

        System.out.println("--------------------------------------------------------- ");

        //Ex2, to print all the odd numbers from 1-100 without showing any even number.
        for (int i = 1; i <=100 ; i++) {
            if(i%2==1)
            { System.out.println(i+ "-> Is odd number"); }
            else{continue; }

        }

        System.out.println("--------------------------------------------------------- ");
        //Ex3, to print numbers from 1-10 and stop when it reaches to 4.
        for (int i = 1; i <=10 ; i++) {

            System.out.println(i);
            if (i==4)
            {
                break;
            }

        }

       System.out.println("--------------------------------------------------------- ");
        //Ex4, this part will put every letter of my name in a new line.
        String MyName="Wejdan";
        for(int i=0; i<MyName.length(); i++){
            System.out.println(MyName.charAt(i));
        }

        System.out.println("--------------------------------------------------------- ");
        //Ex5, this part will do the opposite of Ex4, and it'll put every letter of my name in a new line.
        //variable 'r' means revers.

        String MyName2 = "Wejdan";
        for (int r = MyName2.length()-1; r >=0; r--) {
            System.out.println(MyName2.charAt(r));
        }


    }
}
