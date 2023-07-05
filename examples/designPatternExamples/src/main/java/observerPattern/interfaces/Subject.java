package main.java.observerPattern.interfaces;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifiyObserver();
}
