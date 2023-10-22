package Oops;
class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    boolean duplex;
    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.duplex = duplex;
        if(tonerLevel < 0)
            tonerLevel = 0;
        if(tonerLevel > 100)
            tonerLevel = 100;
        this.pagesPrinted = pagesPrinted;
        this.tonerLevel = tonerLevel;
    }
    public int addToner(int tonerAmount) {
        this.tonerLevel += tonerAmount;
        if(tonerLevel > 100)
            return -1;
        return tonerLevel;
    }
    public int printPages(int pages) {
        if(duplex)
            System.out.println("It's a duplex printer.");
        return 2 * (pagesPrinted + pages);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Printer p = new Printer(10, 10, true);
        System.out.println(p.printPages(0));
        System.out.println(p.addToner(100));
    }
}
