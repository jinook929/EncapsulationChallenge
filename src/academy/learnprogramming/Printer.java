package academy.learnprogramming;

public class Printer {

    private int tonerLevel = 50;
    private int pagesPrinted = 0;
    private boolean isDuplex = true;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if(tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int fillUp) {
        if(this.tonerLevel + fillUp > 100) {
            this.tonerLevel = 100;
        } else if(this.tonerLevel + fillUp < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel += fillUp;
        }
    }

    public void printingPages(int printedPages) {

        if(this.isDuplex) {
            if(printedPages > 0) {
//                if(printedPages % 2 == 0) {
//                    this.pagesPrinted += (printedPages / 2);
//                } else {
//                    this.pagesPrinted += (printedPages / 2) + 1;
//                }
                this.pagesPrinted += (printedPages / 2) + (printedPages % 2);
                System.out.println("Printing in duplex mode");
            }
        } else {
            if(printedPages > 0) {
                this.pagesPrinted += printedPages;
            }
        }

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
