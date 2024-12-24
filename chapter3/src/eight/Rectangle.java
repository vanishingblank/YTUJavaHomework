package eight;

abstract class Rectangle extends Shape {
    private double Length,Weight;
    public Rectangle(double Length,double Weight){
        this.Length=Length;
        this.Weight=Weight;

    }
    @Override
    public double getArea(){
        return Length*Weight;
    }
    @Override
    public double getPerimeter(){
        return 2*(Length+Weight);
    }
}
