public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public void print(int i, int i1) {
        int sheetsToPrint = i * i1;
        if (this.sheets >= (sheetsToPrint)) {
            this.sheets -= sheetsToPrint;
            this.toner -= sheetsToPrint;
        }
    }

    public int getSheets() {
        return this.sheets;
    }

    public int refillPaper() {
        return this.sheets + (100 - this.sheets);
    }

    public int getToner() {
        return this.toner;
    }
}






