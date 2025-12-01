package Day_4_Solution;

public class SuperClass {

    public static void main(String[] args) {

        //write your answer here
        Vehicle v = new Vehicle();
        v.noOfWheels();
        Scooter s = new Scooter();
        s.noOfWheels();
        Car c = new Car();
        c.noOfWheels();
    }
}
class Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels undefined");
    }
}
class Scooter extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels 2");
    }
}
class Car extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels 4");
    }
}