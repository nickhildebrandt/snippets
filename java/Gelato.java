public class Gelato {
    public static void main(String[] args) {
        Kasse eingang = new Kasse();
        eingang.setEuroBetrag(4);
        eingang.setCentBetrag((byte) 99);
        eingang.addBetrag(10, (byte) 2);
        eingang.printKasseninhalt();
    }
}

class Kasse {
    private int euroBetrag;
    private byte centBetrag;

    public Kasse () {
        this.euroBetrag = 0;
        this.centBetrag = 0;
    }

    public int getEuroBetrag() {
        return euroBetrag;
    }

    public void setEuroBetrag(int euroBetrag) {
        this.euroBetrag = euroBetrag;
    }

    public byte getCentBetrag() {
        return centBetrag;
    }

    public void setCentBetrag(byte cent) {
        byte addCent = (byte) (this.centBetrag + cent);

        if (addCent > 100) {
            this.euroBetrag += addCent / 100;
            this.centBetrag = (byte) (addCent % 100);
            return;
        }

        this.centBetrag += cent;
    }

    public void addBetrag(int euro, byte cent) {
        byte addCent = (byte) (this.centBetrag + cent);
        this.euroBetrag += euro;

        if (addCent > 100) {
            this.euroBetrag += addCent / 100;
            this.centBetrag = (byte) (addCent % 100);
            return;
        }

        this.centBetrag += cent;
    }

    public void printKasseninhalt(){
        System.out.printf("Kasse\n\tEuro: %d\tCent: %d\n", this.euroBetrag, this.centBetrag);
    }
}