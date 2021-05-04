package easy;

import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the highest number that FizzBuzz will calculate:");

        int max = s.nextInt();
        System.out.println(fizzBuzz(max));
    }

    public static String fizzBuzz(int max)
    {
        String toReturn = "";

        for(int i=0;i<=max;++i){
            if(i != 0){
                if(i % 3 == 0 && i % 5 == 0){
                    toReturn += "FizzBuzz, ";
                } else if(i % 3 == 0){
                    toReturn += "Fizz, ";
                } else if(i % 5 == 0){
                    toReturn += "Buzz, ";
                } else{
                    toReturn += i + ", ";
                }
            } else {
               toReturn += "0, ";
            }
        }

        return toReturn;
    }
}
