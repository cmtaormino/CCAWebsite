
package beans;

public class Account {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String company;
    private String jobTitle;
    private String department;
    private String bio;
    private String role;
    
    public Account(){
        id = 0;
    }
    
    public Account(long id, String firstName, String lastName, String email, String password, String company, String jobTitle, String department, String bio, String role){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this. email = email;
        this.password = password;
        this.company = company;
        this.jobTitle = jobTitle;
        this.department = department;
        this.bio = bio;
        this.role = role;
    }
    
    public long getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public String getCompany(){
        return this.company;
    }
    public String getJobTitle(){
        return this.jobTitle;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getBio(){
        return this.bio;
    }
    public String getRole(){
        return this.role;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setBio(String bio){
        this.bio = bio;
    }
    public void setRole(String role){
        this.role = role;
    }
}