
package beans;

public class Login {
    private long id;
    private String name;
    private String password;
    
    public Login(){
        id = 0;
    }
    
    public Login(long id, String name, String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }
    
    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getPassword(){
        return this.password;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
}
