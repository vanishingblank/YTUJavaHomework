package seven;

public class MyDate {
    private int Year;
    private int Month;
    private int Day;
    public MyDate(int Year, int Month, int Day) {
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
    }
    @Override
    public String toString(){
        return Year+"-"+Month+"-"+Day;
    }
}
