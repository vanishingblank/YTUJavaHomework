/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Arrays;
public class Thread2 extends Thread{
    RandomNumber rn;
    public Thread2(RandomNumber rn){
    this.rn = rn;
    }
    @Override
    public void run(){
        int[] nums = rn.getRandom();
        int l = nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<l;i++){
            System.out.print(nums[i]+" ");
        }
         System.out.println();
    }
}
