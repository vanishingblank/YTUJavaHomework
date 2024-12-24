package seven;

public class Teacher extends Employee{
    private String WorkTime,Level;
    public Teacher(String Name, String Address, String PhoneNumber, String Email, String Office, double Money, MyDate FirstWorkDay, String WorkTime, String Level){
        super(Name,Address,PhoneNumber,Email,Office,Money,FirstWorkDay);
        this.WorkTime=WorkTime;
        this.Level=Level;
    }
    @Override
    public String toString(){
        return super.toString()+",WorkTime:"+WorkTime+",Level:"+Level;
    }
}
