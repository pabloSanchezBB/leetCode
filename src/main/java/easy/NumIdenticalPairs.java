package easy;

class NumIdenticalPairs {
    public int numIdenticalPairs(int[] nums)
    {
        int temp; //temp to store an int in nums to compare to the rest
        int count = 0; //counter for the number of identical pairs

        for(int i=0;i<nums.length;++i){ //first iterator of the array
            temp = nums[i]; //set temp on each loop
            for(int j=0;j<nums.length;++j){ //check through the rest of the array and compare to temp
                if(nums[i] == nums[j] && i<j) count++; //increment count if the pair is identical
            }
        } return count;
    }
}