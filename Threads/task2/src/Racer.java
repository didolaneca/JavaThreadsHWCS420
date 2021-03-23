public class Racer implements Runnable{ /* TODO
This class is exactly as the Racer from Task 1*/

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
