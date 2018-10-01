package helthypets;

import javax.swing.JOptionPane;

/**
 *
 * @author Lovisa
 */
public class Dog extends Pet implements Guest{
    
    public Dog(String name, double weight){
        super(name, weight);
    }
    
    @Override
    public void food(){
        double amount = this.getWeight() / 100.0;
        JOptionPane.showMessageDialog(null, this.getName() + " ska ha " + amount + " gram hundmat");
    }
}
