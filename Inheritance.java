import java.io.*;
class Vehicle{
    void startEngine(){
        System.out.println("vehicles engine started");
    }
}
class Car extends Vehicle{
    void honk(){
        System.out.println("beep beep");
    }
}
public class Inheritance{
    public static void main(String[] args){
        Car car = new Car();
        car.startEngine();
        car.honk();
    }

}
