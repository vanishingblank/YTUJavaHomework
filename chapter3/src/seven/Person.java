package seven;

public class Person {
    private String Name,Address,PhoneNumber,Email;
    public Person(String Name,String Address,String PhoneNumber,String Email){
        this.Name=Name;
        this.Address=Address;
        this.PhoneNumber=PhoneNumber;
        this.Email=Email;
    }
    @Override
    public String toString(){
        return "Name:"+Name+",Address:"+Address+",PhoneNumber"+PhoneNumber+",Email:"+Email;
    }
}
