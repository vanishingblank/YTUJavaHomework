package cn.com.my;

public class MyStock {
    int id;
    String name;
    double previousPrice;
    double currentPrice;
    public MyStock(int id,String name,double previousPrice,double currentPrice){
        this.id=id;
        this.name=name;
        this.previousPrice=previousPrice;
        this.currentPrice = currentPrice;
    }
    public double getPriceChange(){
        return (currentPrice-previousPrice)/previousPrice;
    }
}
