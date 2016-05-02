
package beans;

public class Bonus {
    private long id;
    private int potentialBonus;
    private int actualBonus;
    
    public Bonus(){
        id = 0;
    }
    
    public Bonus(int id, int potentialBonus, int actualBonus){
        this.id = id;
        this.potentialBonus = potentialBonus;
        this.actualBonus = actualBonus;
    }
    
    public long getId(){
        return this.id;
    }
    public int getPotentialBonus(){
        return this.potentialBonus;
    }
    public int getActualBonus(){
        return this.actualBonus;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setPotentialBonus(int potentialBonus){
        this.potentialBonus = potentialBonus;
    }
    public void setActualBonus(int actualBonus){
        this.actualBonus = actualBonus;
    }
}
