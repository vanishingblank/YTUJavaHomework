package cn.com.my;
import java.util.Date;
public class MyAccount {
    //1-4
    private int id=0;
    private double balance=0;
    private double annualRate=0;
    private Date dateCreated;
    //5
    public MyAccount(){
        this.id=1;
        this.balance=2.0;
        this.annualRate=3.0;
        this.dateCreated  = new Date(2024);
    }
    //6
    public MyAccount(int id,double balance){
        this.id=id;
        this.balance=balance;
        this.annualRate=3.0;
        this.dateCreated  = new Date(2024);
    }
    //7
    public int GetId(){
        return id;
    }
    public double GetBalance(){
        return balance;
    }
    public double GetAnnualRate(){
        return annualRate;
    }
    public void SetId(int id){
        this.id = id;
    }
    public void SetBalance(double balance){
        this.balance = balance;
    }
    public void SetAnnualRate(double annualRate){
        this.annualRate = annualRate;
    }
    //8
    public Date GetDateCreated(){
        return dateCreated;
    }
    //9
    public double GetMonthRate(){
        return annualRate/12;
    }
    //10
    public double WithDraw(double money){
        if(balance>=money){
            balance -= money;
        }

        return balance;
    }
    //11
    public double Deposit(double money){
        balance += money;
        return balance;
    }
}
