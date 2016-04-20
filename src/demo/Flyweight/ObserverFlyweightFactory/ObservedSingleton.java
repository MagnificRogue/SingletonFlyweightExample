package demo.Flyweight.ObserverFlyweightFactory;

import java.util.HashMap;

/**
 *
 * @author dustyn
 */
public class ObservedSingleton {
    private String state;
    
    protected HashMap<Integer, Observer> observers;
    
    
    private ObservedSingleton() {
    }
    
    public void notifyObservers() {
        for(Observer o : observers.values()) {
            o.update();
        }
    }
    
    
    public static ObservedSingleton getInstance() {
        return ObservedSingletonHolder.INSTANCE;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }
    
    private static class ObservedSingletonHolder {

        private static final ObservedSingleton INSTANCE = new ObservedSingleton();
    }
}
