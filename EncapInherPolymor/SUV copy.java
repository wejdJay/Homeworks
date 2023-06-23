package Exercises;
//SUBERCLASS
public class SUV extends Vehicle{
    public SUV (String name, int manufacturingYear, int price, int doors){
     super(name,manufacturingYear,price, doors);
    }

    public static void main(String []args){
        SUV suvObj = new SUV("Hyundai",2007,38000,4);
        System.out.println("SUV name: "+suvObj.name+
                "\n"+"Manufacturing year: "+suvObj.manufacturingYear+
                "\n"+"Price: "+suvObj.price);
        /*System.out.println(suvObj.doors);  I CAN'T ACCESS TO "doors" ATTRIBUTE BECAUSE IT'S PRIVATE, I CAN
        ACCESS TO THIS ATTRIBUTE ONLY BY USING SETTER AND GETTER METHODS.
        */
        suvObj.setDoors(4);
        System.out.println("How many doors does this "+ suvObj.name+" have? "+suvObj.getDoors());
        System.out.println(suvObj.maintainableEmpty());
    }

    boolean maintainableEmpty(){
        System.out.print("Is this "+name+" maintainable? ");
        return manufacturingYear>=2020 && manufacturingYear<=currentYear;
    }



}
