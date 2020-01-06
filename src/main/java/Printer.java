public class Printer {

    private int paperAmount;

    public Printer(int paperAmount){
        this.paperAmount = paperAmount;
    }

    public int paperAmount(){
        return this.paperAmount;
    }

    public void print(int pageNum, int copiesNum){
        if (this.paperAmount >= (pageNum * copiesNum)) {
            this.paperAmount -= (pageNum * copiesNum);

        }
    }

}

