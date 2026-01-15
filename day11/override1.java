package day11;
class Vehical{
    int speed=0;
    public void speedUp(){
        speed+=5;
        System.out.println("Vehicle speed is: "+speed);
    }
}

class Car extends Vehical{
    @Override     // use Override is the best practice. compiler will give and detect error if 
                  // method have differnt name or arguments otherwise we will have difficulty to find error
    public void speedUp(){
        speed+=10;
        System.out.println("Car speed is: "+speed);
    }
}

class Bicycle extends Vehical{
    @Override   
    public void speedUp(){
        speed+=20;
        System.out.println("Bicycle speed is: "+speed);
    }
}
public class override1 {
    public static void main(String[] args) {
        Car car=new Car();
        Bicycle bicycle=new Bicycle();
        

        car.speedUp();
        bicycle.speedUp();
    }
}
