package demo.Flyweight.SingletonFlyweightFactory;

import demo.Flyweight.FlyweightFactory;

/**
 *
 * @author dustyn
 */
public class SingletonFlyweightFactory {
    
    private SingletonFlyweightFactory() {
    }
    
    public static FlyweightFactory getInstance() {
        return SingletonFlyweightFactoryHolder.INSTANCE;
    }
    
    private static class SingletonFlyweightFactoryHolder {

        private static final FlyweightFactory INSTANCE = new FlyweightFactory();
    }
}
