package cn.com.my;

public class Student implements Sortable{
    private int score;
    public Student(int score){
        this.score=score;
    }
    @Override
    public int compare(Sortable s) {
        Student ss = (Student) s;
        if(ss.score == this.score) {
            return 0;
        }
        else if(ss.score > this.score) {
            return 1;
        }
        else {
            return -1;
        }
    }
    public String toString() {
        return ""+this.score;
    }

}
