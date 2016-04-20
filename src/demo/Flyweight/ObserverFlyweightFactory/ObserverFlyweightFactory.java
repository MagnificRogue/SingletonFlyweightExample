package demo.Flyweight.ObserverFlyweightFactory;

import java.util.HashMap;

/**
 *
 * @author dustyn
 */
public class ObserverFlyweightFactory  {
        
    protected HashMap<Integer, Observer> flyweights;
    
    public ObserverFlyweightFactory() {
        this.flyweights = new HashMap<>();
        ObservedSingleton.getInstance().observers = this.flyweights;
    }

    public Observer get(int id) {
        Observer o = flyweights.get(id);
        
        if(o == null) {
            flyweights.put(id, new ConcreteObserver(ObservedSingleton.getInstance()));
            o = flyweights.get(id);
        }
        
        return o;
    }    
}
