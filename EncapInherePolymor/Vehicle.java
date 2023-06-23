package Exercises;
//SUPPERCLASS
public class Vehicle {
    String name ;
    int currentYear =2023;
    int manufacturingYear;
    protected int price ;
    private int doors ;
    public Vehicle (String name, int manufacturingYear, int price, int doors){
        this.name=name;
        this.manufacturingYear=manufacturingYear;
        this.price=price;
        this.doors= doors;
    }

    public static void main (String []args){
        Vehicle vehObj = new Vehicle("Mazda", 2023,70000, 4);

        System.out.println("Vehicle name: "+vehObj.name+"\nManufacturing year: "+vehObj.manufacturingYear +
                "\nPrice: "+vehObj.price+"\nHow many doors does this "+vehObj.name+" have? "+vehObj.doors);
        System.out.println(vehObj.maintainable(2019));
        System.out.println("-------------------------");
        vehObj.name="Camry";
        System.out.print("Vehicle name: "+vehObj.name+"\nPrice: "+vehObj.price+"\n");
        System.out.println(vehObj.maintainableEmpty());
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getDoors() {
        return this.doors;
    }

    boolean maintainable(int manufacturingYear){
        System.out.print("Is this vehicle maintainable? ");
        return manufacturingYear>=2020 && manufacturingYear<=currentYear;
    }

    boolean maintainableEmpty(){
        System.out.print("Is this vehicle maintainable? ");
        return manufacturingYear>=2020 && manufacturingYear<=currentYear;
    }



}
