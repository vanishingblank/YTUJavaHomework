public class LookDivision {
    public static void getExact(int a,int b){
        int timer = 0;
        for(int i=100;i<=1000;i++){
            if(i%a==0||i%b==0)
            {
                System.out.printf(i+" ");
                timer++;
                if(timer%10==0){
                    System.out.printf("\n");
                }
            }
        }
        return;
    }
    public static void getDoubleExact(int a,int b){
        int timer = 0;
        for(int i=100;i<=1000;i++){
            if((i%a==0&&i%b!=0)||(i%b==0&&i%a!=0))
            {
                System.out.printf(i+" ");
                timer++;
                if(timer%10==0){
                    System.out.printf("\n");
                }
            }
        }
        return;
    }
}
