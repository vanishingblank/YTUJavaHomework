/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Thread1 extends Thread{
    RandomNumber rn;
    public Thread1(RandomNumber rn){
    this.rn = rn;
    }
    @Override
    public void run(){
        int[] nums = rn.getRandom();
        int l = nums.length;
        for(int i=0;i<l-1;i++){
            for(int j =0;j<l-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1]=temp;
                }
                
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(nums[i]+" ");
        }
         System.out.println();
    }
    
}
