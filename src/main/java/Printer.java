public class Printer {
    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public void print(int i, int i1) {
        int sheetsToPrint = i * i1;
        if (this.sheets >= (sheetsToPrint)){
            this.sheets -= sheetsToPrint;
        }
    }


    public int getSheets() {
        return this.sheets;
    }






