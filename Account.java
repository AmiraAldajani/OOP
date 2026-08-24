public class Account {
    private String id, name;
    private int balance =0;

    public Account(){}
    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance= balance;
    }
    //setters
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    //getters
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    //logic
    public int amount( int amount){
        balance = balance + amount;
        return balance;
    }
    public int debit( int amount){
        if ( amount<=balance)
            balance = balance - amount;
        else
            System.out.println("Sorry, not enough credit to withdraw");
        return balance;
    }
    public int transferTo( Account account, int amount){
        if (balance - amount > -1) {
            balance = balance - amount;
            account.balance = account.balance + amount;
        }
        else
            System.out.println("Failed. not enough balance to transfer");

        return balance; // money left
    }
    public String toString(){
        return "Id: "+getId()+"\nName: "+getName()+"\nCredit: "+getBalance();
    }
}
