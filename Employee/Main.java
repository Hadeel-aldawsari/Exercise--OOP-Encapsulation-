//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee("2222","Omar",11000);

        //use set
        employee1.setName("Hadeel");
        employee1.setId("11111");
        employee1.setSalary(8000);

        //use get
        System.out.println("Employee: "+ employee1.getName()+"his salary: "+ employee1.getSalary()+"SR");
        System.out.println("his salary after raised 30%:"+employee1.raisedSalary(30));
        //get annual
        System.out.println("his annual salary: "+employee1.getAnnualSalary()+"SR");


        //use toString method
        System.out.println(employee2.toString());







    }
}