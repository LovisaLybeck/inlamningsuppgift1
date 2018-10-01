package helthypets;

import javax.swing.JOptionPane;

/**
 *
 * @author Lovisa
 */
public class Snake extends Pet implements Guest{
    
    public Snake(String name, double weight){
        super(name, weight);
    }
    
    @Override
    public void food(){
        JOptionPane.showMessageDialog(null, this.getName() + " ska ha 20 gram ormpellets");
    }
}
