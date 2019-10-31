package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(80, 5, true);
        printer.fillUpToner(5);
        System.out.println("Remaining toner level= " + printer.getTonerLevel());
        printer.printingPages(500);
        System.out.println("Number of pages printed " + printer.getPagesPrinted());
        System.out.println("Is the printer duplex? " + printer.isDuplex());
    }
}
