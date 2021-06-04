public class oopsConstructor {
    int i = 1;
    oopsConstructor() {                                   // no arg constructor
        System.out.println("Object is created now!");
    }

    public static void main(String[] args) {
        oopsConstructor obj = new oopsConstructor();
        Vehicles car = new Vehicles(8);
        Vehicles car1 = new Vehicles(3,"Blue");
        System.out.println(car.wheels + " wheels");
        System.out.println("The car has "+car1.wheels+ " vehicles. And It is "+ car1.color + " in color." );
        System.out.println("This is me " + obj.i);
    }
}
class Vehicles {
    int wheels;        // this.wheels is for current object which is created here
    String color;
    Vehicles(int wheels) {                      // parameterised constructor
        this.wheels = wheels;
        color = "Blue";
    }
    Vehicles(int wheels, String color) {            // constructor overloaded, diff param.
        this.wheels = wheels;
        this.color = color;
    }

}
