
class car {
    void run() {
        System.out.println(" tata car is running");
    }

}
 class truck extends car{
    void run(){

        System.out.println("truck is running");
    }
    void run(int wheel){
        System.out.println("thirty five");
                                         
    }
 }
class Vehicle extends truck{
    void run()
     {
        System.out.println("Car is running");
    }

    public static void main(String[] args) {
        
        Vehicle obj = new Vehicle();
        obj.run();
        obj.run(35);
    }

}
