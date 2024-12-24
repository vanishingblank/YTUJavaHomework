package cn.com.my;

public class Rectangle implements Sortable{
    private int width;
    private int length;
    public Rectangle(int w,int h) {
        this.width=w;
        this.length=h;
    }
    public int area() {
        return this.width*this.length;
    }
    @Override
    public int compare(Sortable s) {
        Rectangle ss = (Rectangle) s;
        if(ss.area() == this.area()) {
            return 0;
        }
        else if(ss.area() > this.area()) {
            return 1;
        }
        else {
            return -1;
        }
    }
    public String toString() {
        return ""+this.area();
    }
}
