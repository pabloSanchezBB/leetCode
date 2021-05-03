package easy;
/*
    given array of {x1,x2,...,xn,y1,y2,...,}
*/
class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n)
    {
        //create empty array to place the shuffled ints
        int[] toReturn = new int[2*n];

        //These used to be 1 Loop but it doesn't work for some reason

        for(int i=0;i<n;++i){
            toReturn[2*i] = nums[i];
        }

        for(int i=0;i<n;++i){
            toReturn[2*i + 1] = nums[n+i];
        }

        return toReturn;
    }
}