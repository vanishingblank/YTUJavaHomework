public class ComputeEquation {
    public static void computeRoot(float a,float b,float c){
        float delta = b*b-4*a*c;
        if(delta<0){
            System.out.println("无根");
            return;
        }else if(delta==0){
            System.out.println("一个根 "+(-b+Math.pow(delta,0.5))/(2*a));
            return;
        }else{
            System.out.println("两个根 "+(-b+Math.pow(delta,0.5))/(2*a)+" "+(-b-Math.pow(delta,0.5))/(2*a));
            return;
        }
    }
}
