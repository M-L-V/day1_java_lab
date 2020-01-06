public class Waterbottle {

    private double volume = 100.00;

    public double getVolume(){
        return this.volume;
    }

    public void drink(){
        this.volume -= 10.00;
    }
}
