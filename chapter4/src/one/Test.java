package one;

public class Test {
    public static void main(String[] args) {
        MobileTelephone phone = new MobileTelephone();

        SIMOfChinaMobile mobileCard = new SIMOfChinaMobile();
        mobileCard.setNumber("114514");
        SIMOfChinaUnicom unicomCard = new SIMOfChinaUnicom();
        unicomCard.setNumber("1919810");

        phone.useSIM(mobileCard);
        phone.showMess();
        phone.useSIM(mobileCard, unicomCard);
        phone.showMess();
    }
}
