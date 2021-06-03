package easy;

import java.util.ArrayList;

/**
 * Takes a List where every two elements is a frequency followed by a value, so the result
 * will have "value" in the array "frequency" times
 *
 * Ex 1: [1,2,3,4] returns [2,4,4,4]
 * Ex 2: [5,6] returns [6,6,6,6,6]
 */
class DecompressList {
    public int[] decompressRLElist(int[] nums)
    {
        ArrayList<Integer> toRet = new ArrayList<>();

        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];++j){
                toRet.add(nums[i+1]);
            }
        }
        int[] finished = new int[toRet.size()];
        for(int k=0;k<toRet.size();++k){
            finished[k] = toRet.get(k);
        }

        return finished;
    }
}
