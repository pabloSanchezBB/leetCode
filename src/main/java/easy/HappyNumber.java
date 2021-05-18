package easy;

/**
 * This Class Checks if a Number is Happy, i.e if the sum of the squares of each digit == 1
 */

import java.util.HashSet;

class HappyNumber {
    public boolean isHappy(int n)
    {
        // use a HashSet for storing the int
        HashSet<Integer> hS = new HashSet<>();
        hS.add(n);
        // use a while loop for n > 0
        int digit;
        int sum;
        while(n>0){
            sum = 0;
            // loop through to add the digits to the "happy check"
            while(n>0){
                digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            //check if num is happy to exit
            if(sum == 1) return true;

            //check if the sum is already in the set(aka the pattern is looping and is therefore false)
            if(hS.contains(sum)) return false;

            //otherwise repeat...
            hS.add(sum);
            n = sum;
        }
        return false;
    }
}