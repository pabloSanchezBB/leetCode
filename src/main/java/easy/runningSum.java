package easy;
/*
    Compute Running Sum: for [a,b,c,d] compute [a, a+b, a+b+c, a+b+c+d]
*/
class RunningSum {
    public int[] runningSum(int[] nums) {

        int runningSum = 0;
        int[] sol = nums;

        for(int i=0;i<nums.length;++i){
            runningSum += nums[i];
            sol[i] = runningSum;
        } return sol;
    }
}