package main.java.patterns.observer.interfaces;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifiyObserver();
}
