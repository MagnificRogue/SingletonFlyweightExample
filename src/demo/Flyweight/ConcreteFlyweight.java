package demo.Flyweight;

/**
 *
 * @author dustyn
 */
public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation(ExtrensicState t) {
        System.out.println("I am a flyweight being manipulated by the Extrensic State");
    }
    
}
