package one;

public class MobileTelephone {
    private SIMable singleCard,doubleCardOne,doubleCardTwo;
    public MobileTelephone(){
        this.singleCard = null;
        this.doubleCardOne = null;
        this.doubleCardTwo = null;
    }
    public MobileTelephone(SIMable card){
        this.singleCard = card;
        this.doubleCardOne = null;
        this.doubleCardTwo = null;
    }
    public MobileTelephone(SIMable cardOne,SIMable cardTwo){
        this.singleCard = null;
        this.doubleCardOne = cardOne;
        this.doubleCardTwo = cardTwo;
    }
    public void useSIM(SIMable card){
        this.singleCard = card;
        this.doubleCardOne = null;
        this.doubleCardTwo = null;
    }
    public void useSIM(SIMable card1,SIMable card2){
        this.singleCard = null;
        this.doubleCardOne = card1;
        this.doubleCardTwo = card2;
    }
    public void showMess(){
        if(singleCard!=null){
            System.out.println("单卡"+singleCard.giveCorpName()+singleCard.giveNumber());
        }
        if(doubleCardOne!=null){
            System.out.println("双卡1"+doubleCardOne.giveCorpName()+doubleCardOne.giveNumber());
        }
        if(doubleCardTwo!=null){
            System.out.println("双卡2"+doubleCardTwo.giveCorpName()+doubleCardTwo.giveNumber());

        }

    }
}
