package easy;
/*
    Finding how many stones you have are also Jewels
    1. Store a char of jewels and compare it to all of the chars in stones
    2. Loop through jewels and repeat 1. in every loop
*/
class numJewelsInStones {
    public int numJewelsInStones(String jewels, String stones)
    {
        char temp;
        int count = 0;
        for(int i=0;i<jewels.length();++i){
            temp = jewels.charAt(i);
            for(int j=0;j<stones.length();++j){
                if(temp == stones.charAt(j)) count++;
            }
        } return count;
    }
}