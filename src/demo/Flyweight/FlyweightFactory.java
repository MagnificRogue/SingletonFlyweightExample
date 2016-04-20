package demo.Flyweight;

import java.util.HashMap;

/**
 *
 * @author dustyn
 */
public class FlyweightFactory {
    
    public FlyweightFactory() {
        this.flyweights = new HashMap<>();
    }
    
    
    protected HashMap<Integer, Flyweight> flyweights;
    
    public Flyweight get(int id) {
        Flyweight f = flyweights.get(id);
        
        if(f == null) {
            flyweights.put(id, new ConcreteFlyweight());
            f = flyweights.get(id);
        }
        
        return f;
    }
    
}
