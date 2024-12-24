package seven;

public class Staff extends Employee{
    private String WorkName;
    public Staff(String Name, String Address, String PhoneNumber, String Email, String Office, double Money, MyDate FirstWorkDay, String WorkName){
        super(Name,Address,PhoneNumber,Email,Office,Money,FirstWorkDay);
        this.WorkName=WorkName;
    }
    @Override
    public String toString(){
        return super.toString()+",WorkName:"+WorkName;
    }
}
