package medium;

class LargestXOR {
    public int findMaximumXOR(int[] nums) {
//         int i = 0; //first iterator
//         int j = 0; //second iterator

//         int largest = (nums[i]^nums[j]);

//         while(i<nums.length-1){ //1st iterator goes from 0-(n-1)st term as if i = n-2, then j must = n-1

//             j = i+1; //set j to the first index past i b/c i <= j

//             while(j<nums.length){
//                 if((nums[i]^nums[j]) > largest) largest = (nums[i]^nums[j]);
//                 else j++;
//             }
//             i++;
//         }

//         return largest;
        //This Does not work for very large datasets, although it will work for the other test cases


        //The following code is taken from deepak18696's discussion post, study this code and figure out why it works for a large dataset
        TNode head = new TNode();
        for(int i=0;i<nums.length;i++){
            insertTrie(head,nums[i]);
        }
        int max_xor = 0;
        for(int i=0;i<nums.length;i++){
            max_xor = Math.max(max_xor,query(head,nums[i]));
        }

        return max_xor;

    }

    private int query(TNode head, int n) {

        int curr_xor=0;
        TNode curr = head;
        for(int i=31;i>=0;i--){
            int b = (n>>i)&1;

            if(b==0){

                if(curr.right!=null){
                    curr_xor += Math.pow(2, i);
                    curr=curr.right;
                }else{
                    curr=curr.left;
                }
            }else{
                if(curr.left!=null){
                    curr_xor += Math.pow(2, i);
                    curr=curr.left;
                }else curr = curr.right;
            }
        }
        return curr_xor;
    }

    class TNode{
        TNode left;
        TNode right;
        TNode(){};

    }

    void insertTrie(TNode head, int n){

        TNode curr = head;
        for(int i=31;i>=0;i--){
            int b = (n>>i)&1;

            if(b==0){

                if(curr.left==null)
                    curr.left = new TNode();
                curr = curr.left;
            }else{
                if(curr.right==null)
                    curr.right = new TNode();
                curr=curr.right;

            }

        }
    }
}
