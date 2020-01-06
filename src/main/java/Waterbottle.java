public class Waterbottle {

    private double volume = 100.00;

    public double getVolume(){
        return this.volume;
    }

    public void drink(){
        this.volume -= 10.00;
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }
}
