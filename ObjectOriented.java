
public class ObjectOriented {
    public static void main(String[] args){

        //Object = An entity that holds data (attributes) and can perform actions ( methods), it's a reference data type

        Car car = new Car();         //Same as random or scanner, this is how you use object

        //car.isRunning = true;       we can change the attribute

        /*System.out.println(car.make);
        System.out.println(car.model);   //to access attribute you have to put a "." after object's name (it allows to access things) then type the attribute name needed (ex: car.year)
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
         */
        

        car.drive();
        car.brake();

    }
}