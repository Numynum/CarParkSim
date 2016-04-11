package CarParkSim.objects;


/**
 *
 * @author Nienke's boys
 */
public abstract class Car {

    protected Location location;
    protected int minutesLeft;
    protected float minutesParked = 0;
    private boolean isPaying;

    /**
     * Constructor for objects of class Car
     */
    public Car() {
        
    }

    /**
     *
     * @return returns location object
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @param location location object of the car
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     *
     * @return int of the minutes left before leaving
     */
    public int getMinutesLeft() {
        return minutesLeft;
    }

    /**
     *
     * @param minutesLeft int of the minutes left before leaving
     */
    public void setMinutesLeft(int minutesLeft) {
        this.minutesLeft = minutesLeft;
    }
    
    public float getParkedTime(){
        return minutesParked;
    }

    /**
     *
     * @return boolean if car is currently paying
     */
    public boolean getIsPaying() {
        return isPaying;
    }

    /**
     *
     * @param isPaying boolean if car is currently paying
     */
    public void setIsPaying(boolean isPaying) {
        this.isPaying = isPaying;
    }

    /**
     * action that happens every minute (synced with model ticks)
     */
    public void tick() {
        minutesLeft--;
        minutesParked++;
    }

}
