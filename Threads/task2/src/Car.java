public class Car {
    public double miles;
    public double odometer;
    public String name;
    public double maxMiles;

 /* TODO 
Exact same methods and constructor as the Car in task 1*/

    public Car(String name,double miles){
        this.miles = miles;
        odometer = 0;
        this.name = name;
        this.maxMiles = miles;
    }

    public void move(double miles){
        double ml = this.miles - miles;
        if(ml >= 0){
            this.miles = ml;
            this.odometer += miles;
        } else {
            this.odometer += this.miles;
            this.miles = 0;
        }

    }

    public void charge(){
        this.miles = maxMiles;
    }

    public String toString(){
        return name+": odo:"+odometer+" - miles left:"+miles;
    }
}
