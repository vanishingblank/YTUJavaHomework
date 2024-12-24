import java.util.Random;
public class Teacher {
    int num1,num2;
    char way;
    int wayDecide;
    int answer;
    Random r = new Random();
    public Teacher(){
        answer();
    }
    public void answer() {
        this.num1= r.nextInt(100);
        this.num2=r.nextInt(100);
        wayDecide=r.nextInt(4);
        if(wayDecide==1){
            way='+';
            this.answer = num1 + num2;
        }else
        if(wayDecide==2){
            way='-';
            this.answer = num1 + num2;
        }else
        if(wayDecide==3){
            way='*';
            this.answer = num1 + num2;
        }else {
            way='/';
            this.answer = num1 + num2;
        }

    }

    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    public char getWay(){
        return way;
    }
    public int getAns(){
        return answer;
    }

}
