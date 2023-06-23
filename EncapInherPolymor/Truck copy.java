package Exercises;
//SUBCLASS
public class Truck extends Vehicle{
    public Truck (String name, int manufacturingYear, int price, int doors){
       super(name,manufacturingYear,price,doors);
    }

    public static void main (String [] args){
        Truck truObj = new Truck("Blue truck",2015,50000,2);
        System.out.println("Truck color: "+truObj.name.toUpperCase()+"\nManufacturing year: "+
                truObj.manufacturingYear +"\nTruck price: "+
                truObj.price+"\nHow many doors does this truck have? "+truObj.getDoors());
        System.out.println(truObj.maintainable(2014));
    }


    boolean maintainable(int manufacturingYear){
        System.out.print("Is this "+ name +" maintainable? ");
        return manufacturingYear>=2015 && manufacturingYear<=currentYear;
    }



}
