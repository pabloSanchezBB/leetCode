package medium;

class ReduceToOneConvertFromString {
    public int numSteps(String s) {
        int count = 0;
        int ans = 0;
        if(s.length() == 1 && s.charAt(0) == '1'){
            return 0;
        }

        for(int i= s.length() - 1; i >= 0; --i)
        { //start at smallest digit and move to the largest
            if(i==0 && s.charAt(i) == '1' && count == 0) break;

            int temp = Character.getNumericValue(s.charAt(i)) +count;
            if(temp % 2 == 0){
                count = temp/2;
                ans++;
            } else{
                ans += 2;
                count = 1;
            }
        }
        return ans;
    }
}