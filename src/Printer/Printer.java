package Printer;

public class Printer {

//    public static void main(String[] args) {
//        Printer printer = new Printer(50, true);
//        System.out.println(printer.addToner(50));
//        System.out.println("initial page count = " +printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
//    }
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 || tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                return this.tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pagesToPrint) {
        if (this.duplex) {
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
            this.pagesPrinted += pagesToPrint;
        } else {
            this.pagesPrinted += pagesToPrint;
        }
        return this.pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
