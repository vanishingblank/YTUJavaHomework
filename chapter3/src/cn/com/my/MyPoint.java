package cn.com.my;

public class MyPoint {
    private double x;
    private double y;
    public void SetX(double x){
        this.x=x;
    }
    public void SetY(double y){
        this.y=y;
    }
    public double GetX(){
        return x;
    }
    public double GetY(){
        return y;
    }
    public MyPoint(){
        this.x=0.0;
        this.y=0.0;
    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distance(MyPoint one,MyPoint two){
        return Math.sqrt(Math.pow(one.x - two.x, 2) + Math.pow(one.y - two.y, 2));
    }
    public double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
