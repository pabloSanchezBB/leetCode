/*
    Given a 2D array of ints, rows = i and represents the customer, col = j and represents a bank
    
    Return the wealth that the richest customer has.
*/
class MaximumWealth {
    public int maximumWealth(int[][] accounts)
    {
        //1. Convert 2D array to 1D array of cumulative wealth
        //2. Sort the Array in Ascending Order
        //3. Return the last(and largest) index

        //sum up the columns in each row and store in an array
        int[] wealths = new int[accounts.length];

        int tempWealth = 0; //temp counter for a customer's wealth

        for(int i=0;i<accounts.length;++i){
            for(int j=0;j<accounts[i].length;++j){
                tempWealth += accounts[i][j];
            }
            wealths[i] = tempWealth;
            tempWealth = 0;
        }

        //do an insertion sort on the 1D array
        int n = wealths.length;
        for (int i = 1; i < n; ++i) {
            int key = wealths[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && wealths[j] > key) {
                wealths[j + 1] = wealths[j];
                j = j - 1;
            }
            wealths[j + 1] = key;
        }

        return wealths[wealths.length-1];
    }
}