package observer;

public class ObserverMain {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.00);
        stockGrabber.setGoogPrice(676.00);
        StockObserver stockObserver2 = new StockObserver(stockGrabber);
        StockObserver stockObserver3 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(198.00);
        stockGrabber.setAaplPrice(677.50);
        stockGrabber.setGoogPrice(676.90);
        stockGrabber.unRegister(stockObserver2);
        stockGrabber.setIbmPrice(198.90);
        stockGrabber.setAaplPrice(677.90);
        stockGrabber.setGoogPrice(676.95);

    }
}
