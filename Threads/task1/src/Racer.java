public class Racer implements Runnable{ /* TODO
Add something here so that you can pass this Racer to the constructor of Thread*/
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.

    /* TODO 
Create a constructor that receives a Car objec and initializes c.*/
//    public Racer (Car c){
//        this.c = c;
//    }
    public Racer(Car car) {
        this.c = car;
    }
    @Override
    /* TODO 
Override one method.  This is the task the thread will perform... You have to determine which method this is.
Check the method description. */
    public void run() {
        System.out.println("inside " + this.c.name + " thread");
        while(this.c.odometer <= this.distance){
//            System.out.println("Car -> " + this.c.name
//                             + "\nMiles to travel -> " + this.distance
//                             + "\nMiles left in the tank -> " + this.c.miles
//                             + "\nMiles traveled -> " + this.c.odometer
//                             + "\n---------------------------------------"
//            );
            if(this.c.miles == 0){
                //charge car
                try {
                    System.out.println("Charging");
                    System.out.println("Car: " + this.c.name);
                    Thread.sleep((long) this.c.maxMiles);
                    this.c.miles = this.c.maxMiles;
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
            this.c.miles--;
            this.c.odometer++;
        }

    }
}
