// 16 (FRQ)
public class DreamVacation {
    private String destination; // a. instance variable 
    private double cost; // b. instance variable
    
    public DreamVacation(){ // c. no-argument constructor method
        destination = "TBD";
        cost = 0.00;
    }

    public DreamVacation(String yourDestination, double yourCost){ 
        // d. parameterized constructor that takes in both variables
        destination = yourDestination;
        cost = yourCost;
    }

    // e. Accessor (getter) methods for both variables
    public String getDestination(){
        return destination;
    }

    public double getCost(){
        return cost;
    }

    // Modifier (setter) methods for both variables
    public void setDestination(String newDestination){
        destination = newDestination;
    }

    public void setCost(double newCost){
        cost = newCost;
    }
}
