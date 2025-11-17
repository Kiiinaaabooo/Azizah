import java.text.DecimalFormat;

public class Task1Guided {
    public static void main(String[] args){
        // Your code here
        // Data
        int priceOfRegular = 50000;
        int priceOf3DMovie = 75000;
        int priceOfImax = 100000;
        int numOfRegular = 3;
        int numOf3DMovie = 2;
        int numOfImax = 1;
        int currency = 500;
        double discountOfRegular = 0.05;
        double discountOf3DMovie = 0.1;
        
        int premiumSeatFee = 20000;
        
        int cashInHand = 500000;
        
        //Calculate Ticket
        double totalOfRegular = priceOfRegular * numOfRegular;
        double totalOf3DMovie = priceOf3DMovie * numOf3DMovie;
        double totalOfImax = priceOfImax * numOfImax;
        
        //Calculate Ticket For Discount
        double discOfRegular = totalOfRegular * discountOfRegular;
        double discOf3DMovie = totalOf3DMovie * discountOf3DMovie;
        
        //Discount Total
        double discountsApplied = discOfRegular + discOf3DMovie;
        
        //Calculate Total
        double totalTicket = totalOfRegular + totalOf3DMovie + totalOfImax + premiumSeatFee - discountsApplied;
        
        //Calculate Change
        double change = cashInHand - totalTicket;
        
        //Donation
        double donation = change % currency;
        
        //Make The Receipt
        System.out.println("=================================================");
        System.out.println("\t\tCinemax Ticket Receipt");
        System.out.println("=================================================");
        System.out.println("Movie Type \tQty \tPrice/Ticket\tSubtotal");
        System.out.println("-------------------------------------------------");
        System.out.println("Regular Movie\t" + numOfRegular + "\t" + priceOfRegular + "\t\t " + totalOfRegular);
        System.out.println("3D Movie\t" + numOf3DMovie + "\t" + priceOf3DMovie + "\t\t " + totalOf3DMovie);
        System.out.println("IMAX Movie\t" + numOfImax + "\t" + priceOfImax + "\t\t " + totalOfImax);
        System.out.println("-------------------------------------------------");
        System.out.println("Discount Applied:\t" + "-" + (int) discountsApplied);
        System.out.println("-------------------------------------------------");
        System.out.println("Premium Seat Fee:\t" + "+" + premiumSeatFee);
        System.out.println("-------------------------------------------------");
        System.out.println("Total Before Rounding:  " + (int) totalTicket);
        System.out.println("Rounding Adjustment:    " + (int) totalTicket);
        System.out.println("-------------------------------------------------");
        System.out.println("Cash Paid:\t" + cashInHand);
        System.out.println("Change:   " + (int) change);
        System.out.println("Donation to Cinemax Movie Fund: 0");
        System.out.println("=================================================");
        System.out.println("Thank You for Visiting CineMax!");
        System.out.println("Enjoy Your Movie!");
        System.out.println("=================================================");
        System.out.println("\t/" + "\\" + "_" + "/" + "\\");
        System.out.println("       ( o.o )");
        System.out.println("        > ^ <");
        System.out.println("      ((     ))");
        System.out.println("     ((       ))");
        System.out.println("    ((         ))");
        System.out.println("   ((           ))");
        System.out.println("  ((_____________))");
    }
}
