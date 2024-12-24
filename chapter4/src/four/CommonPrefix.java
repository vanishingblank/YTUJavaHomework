package four;

public class CommonPrefix {
    public String getPrefix(String s1,String s2){
        int i;
        int commonL;
        if(s1.length()<s2.length()){
            commonL = s1.length();
        }else{
            commonL = s2.length();
        }
        for(i=0;i<commonL;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
        }
        String s = s1.substring(0,i);
        return s;
    }
}
