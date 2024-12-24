package seven;

public class Student extends Person{
    private String ClassID;
    public Student(String Name,String Address,String PhoneNumber,String Email,String ClassID){
        super(Name,Address,PhoneNumber,Email);
        this.ClassID=ClassID;
    }
    @Override
    public String toString(){
        return super.toString()+",ClassID:"+ClassID;
    }
}
