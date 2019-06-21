package observer;

public class StockObserver implements Observer {

    private static int observerIDTracker = 0;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;
    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer:" + observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
        printPirces();
    }

    private void printPirces() {
        System.out.println(observerID + "  Ibm price: " + ibmPrice +"  aapl price: " + aaplPrice + "  goog price: " + googPrice);
        System.out.println();

    }
}
