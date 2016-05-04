
package beans;


public class AccountList {
    private long id;
    private Account[] accounts;
    
    public AccountList(){
        id = 0;
    }
    
    public AccountList(long id, Account[] accounts){
        this.id = id;
        this.accounts = accounts;
    }
    
    public long getId(){
        return this.id;
    }
    public Account[] getAccounts(){
        return this.accounts;
    }
    
    public void setId(long id){
        this.id = id;
    }
    public void setAccounts(Account[] accounts){
        this.accounts = accounts;
    }
}