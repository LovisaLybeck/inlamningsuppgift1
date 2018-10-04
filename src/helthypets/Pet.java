package helthypets;

abstract class Pet implements Guest{
    
    //Här använder jag inkapsling så att det inte går att ändra på name 
    //och weight hur som helst, utan en kan endast se name genom getName,
    //se weight genom getWeight och ändra weight genom setWeight. 
    //name går inte att ändra på.
    private String name;
    private double weight;
    
    public Pet(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
}
