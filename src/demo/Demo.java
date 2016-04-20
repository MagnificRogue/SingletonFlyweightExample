package demo;

import demo.Flyweight.FlyweightFactory;
import demo.Flyweight.ObserverFlyweightFactory.ObservedSingleton;
import demo.Flyweight.ObserverFlyweightFactory.ObserverFlyweightFactory;
import demo.Flyweight.SingletonFlyweightFactory.SingletonFlyweightFactory;

/**
 *
 * @author dustyn
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     //Using a regular singleton and flyweight factory
        
    Singleton swag = Singleton.getInstance();

    System.out.println(System.identityHashCode(swag));
    System.out.println(System.identityHashCode(Singleton.getInstance()));
        
    FlyweightFactory f = new FlyweightFactory();
     
    System.out.println(System.identityHashCode(f.get(1)));
    System.out.println(System.identityHashCode(f.get(1)));

   
    //using a singleton flyweight factory
    System.out.println(System.identityHashCode(SingletonFlyweightFactory.getInstance().get(1)));
    
    
    //using an observer flyweight factory
    
    ObserverFlyweightFactory obs = new ObserverFlyweightFactory();
    for(int i=0; i < 10; i ++) {
        obs.get(i);
    }
    
    ObservedSingleton.getInstance().setState("Raining");
    
    
    }
    
}
