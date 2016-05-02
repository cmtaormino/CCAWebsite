
package beans;

public class Project {
    private long id;
    private String clientName; 
    private String POCName;
    private String email;
    private String office;
    private String cell;
    private String fax;
    private String mailing;
    private String city;
    private String state;
    private String zip;
    private String desc; 
    private String start;
    private String end;
    private Task[] completed;
    private Task[] inProgress;
    private Task[] pending;
            
    public Project(){
        id = 0;
    }
    
    public Project(long id, 
            String clientName, 
            String POCName, 
            String email, 
            String office, 
            String cell, 
            String fax, 
            String mailing, 
            String city, 
            String state, 
            String zip, 
            String desc, 
            String start, 
            String end, 
            Task[] completed, 
            Task[] inProgress, 
            Task[] pending){
        
        this.id = id;
        this.POCName = POCName;
        this.email = email;
        this.office = office;
        this.cell = cell;
        this.fax = fax;
        this.mailing = mailing;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.desc = desc;
        this.start = start;
        this.end = end;
        this.completed = completed;
        this.inProgress = inProgress;
        this.pending = pending;
    }
    
    public long getId(){
        return this.id;
    }
    public String getPOCName(){
        return this.POCName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getOffice(){
        return this.office;
    }
    public String getCell(){
        return this.cell;
    }
    public String getFax(){
        return this.fax;
    }
    public String getMailing(){
        return this.mailing;
    }
    public String getCity(){
        return this.city;
    }
    public String getState(){
        return this.state;
    }
    public String getZip(){
        return this.zip;
    }
    public String getDesc(){
        return this.desc;
    }
    public String getStart(){
        return this.start;
    }
    public String getEnd(){
        return this.end;
    }
    public Task[] getCompleted(){
        return this.completed;
    }
    public Task[] getInProgress(){
        return this.inProgress;
    }
    public Task[] getPending(){
        return this.pending;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setPOCName(String POCName){
        this.POCName = POCName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setOffice(String office){
        this.office = office;
    }
    public void setCell(String cell){
        this.cell = cell;
    }
    public void setFax(String fax){
        this.fax = fax;
    }
    public void setMailing(String mailing){
        this.mailing = mailing;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setStart(String start){
        this.start = start;
    }
    public void setEnd(String end){
        this.end = end;
    }
    public void setCompleted(Task[] completed){
        this.completed = completed;
    }
    public void setInProgress(Task[] inProgress){
        this.inProgress = inProgress;
    }
    public void setPending(Task[] pending){
        this.pending = pending;
    }
}