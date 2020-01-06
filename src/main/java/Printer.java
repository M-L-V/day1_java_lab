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
        if (this.paperAmount >= (pageNum * copiesNum)) {
            this.paperAmount -= (pageNum * copiesNum);

        }
    }

    public int tonerVolume(){
        return this.tonerVolume;
    }
}

