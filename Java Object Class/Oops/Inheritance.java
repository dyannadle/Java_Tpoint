class vehicle{
    void start(){
        System.out.println("vehicle is starting...");
    } 
void stop(){
        System.out.println("vehicle is stopping...");
    }
}

//child class inherts from vehicle class

class car extends vehicle{
    void honk(){
        System.out.println("car is starting...");
    }
}

public class Inheritance{
    public static void main(String [] args){
car myCar = new car();
myCar.start();
myCar.stop();
myCar.honk();    
}
}