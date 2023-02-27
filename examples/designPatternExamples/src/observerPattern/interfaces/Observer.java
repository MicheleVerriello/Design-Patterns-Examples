package observerPattern.interfaces;

public interface Observer { //The observer interface is implemented by all observers

    public void update(float temp, float humidity, float pressure); //These are the state values the observers get from the subject
}
