package medium;

class StringDecompression {
    public int compress(char[] chars) {
        int i = 0;
        int index = 0;

        int j;
        while(i<chars.length) //while our first iterator(points to a char to check for a match) is within the array
        {
            j = i; //set the comparator iterator to the same position as our matching iterator
            while(j<chars.length && chars[i] == chars[j]){ //while j is also within the array and the characters for i and j                                                                    //match...
                j++; //increment j to compare a new char in the array
            }

            chars[index++] = chars[i]; //add the decompressed matching characters(now 1 character) into the next spot in the array

            if(j-i>1){ //if there's more than 2 duplicates of a character...

                //vvv I'm confused past this point... vvv

                String count = j-i + ""; //store the number of duplicates as a String
                for(char c : count.toCharArray()){ //loop through a char Array of that size?
                    chars[index++] = c; //and put the character being duplicated/the number of duplicates in the next spot in the                                           //array
                }
            }
            i = j; //set our iterator at the last position a duplicate was in for the next iteration!
        }
        return index; //index iterates over the new array completely every time, so it is the length!
    }
}
