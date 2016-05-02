
package beans;

public class TaskList {
    private long id;
    private Task[] tasks;
    private String type;
    
    public TaskList(){
        id = 0;
    }
    
    public TaskList(long id, Task[] tasks, String type){
        this.id = id;
        this.tasks = tasks;
        this.type = type;
    }
    
    public long getId(){
        return this.id;
    }
    public Task[] getTasks(){
        return this.tasks;
    }
    public String getType(){
        return this.type;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setTasks(Task[] tasks){
        this.tasks = tasks;
    }
    public void setType(String type){
        this.type = type;
    }
}
