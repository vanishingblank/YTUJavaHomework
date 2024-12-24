public class Runner {
    double miles;
    double KILOMETER_PRE_MILE = 1.557;
    public void run(double kilometer){
        miles = KILOMETER_PRE_MILE*kilometer;
        System.out.println(miles);
    }
}
