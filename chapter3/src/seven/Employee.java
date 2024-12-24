package seven;

public class Employee extends Person{
    private String Office;
    private double Money;
    private MyDate FirstWorkDay;
    public Employee(String Name, String Address, String PhoneNumber, String Email, String Office, double Money, MyDate FirstWorkDay){
        super(Name,Address,PhoneNumber,Email);
        this.Office=Office;
        this.Money=Money;
        this.FirstWorkDay=FirstWorkDay;
    }
    @Override
    public String toString(){
        return super.toString()+",Office:"+Office+",Money:"+Money+",FirstWorkDay"+FirstWorkDay;
    }
}
