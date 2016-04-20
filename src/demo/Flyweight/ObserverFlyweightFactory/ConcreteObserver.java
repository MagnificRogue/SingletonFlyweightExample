/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.Flyweight.ObserverFlyweightFactory;

import demo.Flyweight.ExtrensicState;
import demo.Flyweight.Flyweight;

/**
 *
 * @author dustyn
 */
public class ConcreteObserver implements Observer, Flyweight{

    ObservedSingleton s;

    ConcreteObserver(ObservedSingleton instance) {
        this.s = instance;
    }
    
    
    @Override
    public void update() {
        System.out.println("Dear god, "  + s.getState() + " happened, I will change my behavior!");
        operation(new ExtrensicState(s.getState()));
    }

    @Override
    public void operation(ExtrensicState t) {
        System.out.println(System.identityHashCode(this) + " performing operation");
    }
    
}
