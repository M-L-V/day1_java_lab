public class Printer {

    private int paperAmount;
    private int tonerVolume;

    public Printer(int paperAmount, int tonerVolume){
        this.paperAmount = paperAmount;
        this.tonerVolume = tonerVolume;
    }

    public int paperAmount(){
        return this.paperAmount;
    }

    public void print(int pageNum, int copiesNum){
        int pageNumToPrint = pageNum * copiesNum;
        if (this.paperAmount >= pageNumToPrint){
            this.paperAmount -= pageNumToPrint;
            this.tonerVolume -= pageNumToPrint;
        }
    }

    public int tonerVolume(){
        return this.tonerVolume;
    }
}

