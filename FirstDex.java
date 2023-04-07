public class FirstDex{
    public static void main (String[] args){
        //Ex1,print a name.
        String MyName="Wejdan Mohammed";
        System.out.println(MyName);

          System.out.println("--------------------------------------------------------- ");

          //Ex2,print an age
        int MyAge= 23;
        System.out.println(MyAge);

          System.out.println("--------------------------------------------------------- ");
         //Ex3,print the sum of these 2 numbers and divide them by 2.
        int num1=5;
        int num2=6;
        System.out.println( num1+num2);
        double sum=num1+num2;
        System.out.println(sum+ "/2 = "+sum/2);

          System.out.println("--------------------------------------------------------- ");
//        //Ex4,to calculate the area of the rectangle and its perimeter.
        int length =5;
        int width=7;
        int AreaOfRec=length*width;
        System.out.println("Rectangle area = "+AreaOfRec);
        int sumR =length+width;
        int PerOfRec=sumR*2;
        System.out.println("perimeter = "+PerOfRec);

        System.out.println("--------------------------------------------------------- ");
//        Ex5,to check if these 2 numbers are equals or not.
        int CompN1 =23;
        int CompN2=45;
        if(CompN1==CompN2){
            System.out.println("The first number is equals to the second number");
        }
      else {
            System.out.println("The first number is not equals to the second number");
        }
        System.out.println("--------------------------------------------------------- ");
        //Ex6 & 7,this part will compare two values using "AND" and "OR" operator and prints whither it's true or false.            .
        int a=55;
        int b=70;
        if(a<50 && a<b){
            System.out.println("true using AND operator");
        }
        else {
            System.out.println("false using AND operator ");
        }

        if (a<50 || a<b){
            System.out.println("true using OR operator");
        }
        else {
            System.out.println("false using OR operator");
        }


    }
}
