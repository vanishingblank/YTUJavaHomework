/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Random;
public class RandomNumber {
    
    int n ;
    int[] a ;
    int i;
    public  RandomNumber(){
        Random random = new Random();
        n = random.nextInt(90)+11;
        a = new int[n];
        for(i=0;i<n;i++){
        a[i] = random.nextInt(100);
        }

    }
    public int[] getRandom(){
    return a;
    }
}
