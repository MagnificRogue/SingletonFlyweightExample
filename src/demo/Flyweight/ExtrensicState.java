package demo.Flyweight;

/**
 *
 * @author dustyn
 */
public class ExtrensicState {
    public ExtrensicState(){
        this.state = "No state";
    }
    
    public ExtrensicState(String info) {
        this.state = info;
    }
    public String state;
}
