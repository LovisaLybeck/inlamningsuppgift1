package helthypets;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class HelthyPets {

    public static void main(String[] args) {
                 
        Map<String, Pet> petMap = new HashMap();
        petMap.put("sixten", new Dog("Sixten", 5000.0));
        petMap.put("dogge", new Dog("Dogge", 10000.0));
        petMap.put("venus", new Cat("Venus", 5000.0));
        petMap.put("ove", new Cat("Ove", 3000.0));
        petMap.put("hypno", new Snake("Hypno", 1000.0));
        
        while(true){
            String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");
            
            if(input == null)
                break;

            try{
                input = input.toLowerCase();
                
                //Här används polymorfism så att .food() anropar olika metoder 
                //beroende på vilket typ av djur det är.
                petMap.get(input).food();
                break;

            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "Djuret finns inte");
            }
        }   
    }
}
