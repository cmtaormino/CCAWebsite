
package beans;


public class StringList {
    private long id;
    private String[] strings;
    
    public StringList(){
        id = 0;
    }
    
    public StringList(long id, String[] strings){
        this.id = id;
        this.strings = strings;
    }
    
    public long getId(){
        return this.id;
    }
    public String[] getStrings(){
        return this.strings;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setStrings(String[] strings){
        this.strings = strings;
    }
}