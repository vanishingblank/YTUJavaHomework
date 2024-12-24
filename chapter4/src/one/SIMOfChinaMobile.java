package one;

public class SIMOfChinaMobile implements SIMable {
    private String number;

    @Override
    public void setNumber(String n) {
        this.number = n;
    }

    @Override
    public String giveNumber() {
        return number;
    }

    @Override
    public String giveCorpName() {
        return "移动";
    }
}