import java.util.SortedMap;

public class Account {
private String id;
private String name;
private int balance ;

public Account(String id,String name){
this.id=id;
this.name=name;
this.balance=0;
}

public Account(){

}
    public Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }


    //setters
    public void setId(String id){
    this.id=id;
    }

    public void setName(String name) {
    this.name=name;
    }

    public void setBalance(int balance){
        this.balance=balance;
        }
        //getters

    public String getID(){
    return id;
    }

    public String getName(){
    return name;
    }

    public double getBalance(){
    return balance;
    }

    //methods

    public int credit(int amount){
    int new_balance;
    if(amount==0){
        System.out.println("can't credit 0 ammount");
    } else if (amount<0) {
        System.out.println("invalid ammount, please enter positive number");
    }else {
        new_balance=this.balance=this.balance+amount;
        System.out.println("The credit was completed successfully");
        System.out.println("your upated balance:"+(new_balance)+"SR");
        return (new_balance);
    }
    return 0;
    }

    public int debit(int amount){
        int new_balance;
        if(amount==0){
            System.out.println("enter amount more than zero");
        } else if (amount<0) {
            System.out.println("invalid amount, please enter positive number");
        } else if (amount>this.balance) {
            System.out.println("Sorry your balance les than this amount ");
        } else {
            new_balance=this.balance-amount;
            System.out.println("The debit was completed successfully");
            System.out.println("your upated balance:"+(new_balance)+"SR");
            return (new_balance);
        }
        return 0;
    }

    public int transferTo(Account another, int amount){
        int new_balance;
        if(amount==0){
            System.out.println("enter amount more than zero");
        } else if (amount<0) {
            System.out.println("invalid amount, please enter positive number");
        } else if (amount>this.balance) {
            System.out.println("Sorry your balance les than this amount ");
        } else {
            new_balance=this.balance-amount;
            another.balance=another.balance+amount;
            System.out.println("The transfer To "+another.name+" was completed successfully");
            System.out.println("your upated balance:"+(new_balance)+"SR");
            return (new_balance);
        }
        return 0;
    }


    public String toString(){
        System.out.println("________________");
        String print="This is a print account\nName     |  "+this.name+"" +
                "\nID       | "+this.id+"\nBalance  | "+this.balance+"SR";
      return print;
    }


}
