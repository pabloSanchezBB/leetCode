package easy;
/*
    heights isn't in ascending order, how many ints aren't in that order?
*/
class HeightChecker {
    public int heightChecker(int[] heights)
    {
        int count = 0; //counter for mismatches

        int[] compare = new int[heights.length]; //comparator  int[]

        //copy heights into compare
        for(int i=0;i<heights.length;++i){
            compare[i] = heights[i];
        }

        //Insertion Sort to get the correct order of heights
        int n = compare.length;
        for (int i = 1; i < n; ++i) {
            int key = compare[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && compare[j] > key) {
                compare[j + 1] = compare[j];
                j = j - 1;
            }
            compare[j + 1] = key;
        }

        //increment count every time compare doesn't match up with heights
        for(int i=0;i<heights.length;++i){
            if(compare[i] != heights[i]) count++;
        }

        //return the number of mismatches
        return count;
    }
}