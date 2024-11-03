//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Account account1=new Account();
      Account account2=new Account();

       //set account1
        account1.setName("Hadeel");
        account1.setId("111222");
        account1.setBalance(2000);
        //set account2
        account2.setName("Norah");
        account2.setId("111333");
        account2.setBalance(150);

        //print accounts information before any operation
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println("");

       //do some credit & debit in account1
        System.out.println("Account 1  balance before any opration: "+account1.getBalance());
       account1.credit(100);
       account1.debit(50);
       //test invalid transferred
       account1.transferTo(account2,3000);
       //successful transferred
        account1.transferTo(account2,1000);




    }
}