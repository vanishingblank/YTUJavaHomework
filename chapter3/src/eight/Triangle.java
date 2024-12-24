package eight;

abstract class Triangle extends Shape{
    private double Bottom;
    private double Height;
    private double Length1;
    private double Length2;
    private double Length3;
    public Triangle(double Bottom,double Height,double Length1,double Length2,double Length3){
        this.Bottom=Bottom;
        this.Height=Height;
        this.Length1=Length1;
        this.Length2=Length2;
        this.Length3=Length3;
    }
    @Override
    public double getArea(){
        return Bottom*Height*0.5;
    }
    @Override
    public double getPerimeter(){
        return Length1+Length3+Length2;
    }

}
