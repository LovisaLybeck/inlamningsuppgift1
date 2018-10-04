package helthypets;

import javax.swing.JOptionPane;

public class Cat extends Pet{
    
    public Cat(String name, double weight){
        super(name, weight);
    }
    
    @Override
    public void food(){
        double amount = Math.round((this.getWeight() / 150.0) * 100) / 100.0;
        JOptionPane.showMessageDialog(null, this.getName() + " ska ha " + amount + " gram kattmat");
    }
}
