package observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observerList;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber() {
        this.observerList = new ArrayList<>();
    }

    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void unRegister(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        observerList.forEach(observer -> {
            observer.update(ibmPrice,aaplPrice,googPrice);
        });
    }

    /**
     * Getter for ibmPrice
     *
     * @return ibmPrice
     */
    public double getIbmPrice() {
        return ibmPrice;
    }

    /**
     * Setter for ibmPrice
     *
     * @param ibmPrice
     */
    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    /**
     * Getter for aaplPrice
     *
     * @return aaplPrice
     */
    public double getAaplPrice() {
        return aaplPrice;
    }

    /**
     * Setter for aaplPrice
     *
     * @param aaplPrice
     */
    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    /**
     * Getter for googPrice
     *
     * @return googPrice
     */
    public double getGoogPrice() {
        return googPrice;
    }

    /**
     * Setter for googPrice
     *
     * @param googPrice
     */
    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
