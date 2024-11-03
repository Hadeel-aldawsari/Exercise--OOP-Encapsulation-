public class Employee {

    private String id;
    private String name;
    private int salary;

    public Employee(){

    }

    public Employee(String id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public void setId(String id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public int getAnnualSalary(){
        return (this.salary*12);
    }

    public double raisedSalary(int precent){
       int raised=(precent * this.salary) / 100;
       this.salary=this.salary+raised;

       return this.salary;
    }

    public String toString(){
        return "---Employee information--\n Name:"+this.name+"\n ID:"+this.id+"\n Salary:"+this.salary+"";
    }
}


